/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.DAO.session;
import java.sql.Timestamp;
import java.util.Date;
import model.Paticipant;
import model.PaticipantRoom;
import model.Room;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import view.Navigator;

/**
 *
 * @author phamhung
 */
public class RoomDAO extends DAO{

    public RoomDAO() {
    }
    
    public void createRoom(Room room){
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.save(room);
        trans.commit();
        return;
    }
    
    public Room findRoomById(long id){
        Query query = session.createQuery("from Room r where r.id = "+ id);
        Room room  = (Room)query.getSingleResult();
        return room;
    }
    
    public void joinRoomById(long id){
        Room room  = this.findRoomById(id);
        PaticipantRoom pr = new PaticipantRoom();
        pr.setRoom(room);
        pr.setPaticipant(Navigator.getPaticipantLogin());
        this.createParticipantRoom(pr);
        room.getPaticipantRoom().add(pr);
        this.updateRoom(room);
    }
    public void leaveRoom(Room room){
        PaticipantRoom pr = (PaticipantRoom)session.createQuery("select pr from PaticipantRoom pr, Paticipant p, Room r "
                + "where pr.paticipant = p.id and where room.id = pr.room.id").getSingleResult();
        room.getPaticipantRoom().removeIf(n -> (n.getPaticipant().getId() == Navigator.getPaticipantLogin().getId()));
        this.deleteParticipantRoom(pr);
        this.updateRoom(room);
    }
    
    public void createParticipantRoom(PaticipantRoom pr){
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.save(pr);
        trans.commit();
        return;
    }
    
    public Room findAndJoinPendingRoom(){
        Room room = null;
        Query query = session.createQuery("from Room r where r.status = 'waiting' and size(r.paticipantRoom) < 2");
        query.setFirstResult(0);
        try{
            room = (Room)query.getSingleResult();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        if(room == null){
            room = new Room();
            room.setCreatedBy(Navigator.getPaticipantLogin());
            Date date = new Date();
            room.setCreatedAt(new Timestamp(date.getTime()));
            room.setStatus("waiting");
            this.createRoom(room);
        }
        PaticipantRoom pr = new PaticipantRoom();
        pr.setRoom(room);
        pr.setPaticipant(Navigator.getPaticipantLogin());
        this.createParticipantRoom(pr);
        room.getPaticipantRoom().add(pr);
        this.updateRoom(room);
        return room;
    }
    
    public void updateRoom(Room room){
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.update(room);
        trans.commit();
        return;
    }
    public void updateParticipantRoom(PaticipantRoom pr){
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.update(pr);
        trans.commit();
        return;
    }
    public void deleteParticipantRoom(PaticipantRoom pr){
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.delete(pr);
        trans.commit();
        return;
    }
    
    public void deleteRoom(Room room){
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.delete(room);
        trans.commit();
        return;
    }
}
