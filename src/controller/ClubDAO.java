/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.DAO.session;
import java.util.ArrayList;
import model.Club;
import model.ClubInvitation;
import model.FriendInvitation;
import model.Paticipant;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import view.Navigator;

/**
 *
 * @author phamhung
 */
public class ClubDAO extends DAO{

    public ClubDAO() {
    }
    
    public void createClub(Club club){
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.save(club);
        trans.commit();
        return;
    } 
    
    public Club getClubById(long id){
        Club club = (Club)session.createQuery("from Club c where c.id = " + id).getSingleResult();
        return club;
    }
    
    public void updatedClub(Club club){
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.update(club);
        trans.commit();
        return;
    }
    
    public void inviteJoinClub(Club c,Paticipant p){
        ClubInvitation ci = new ClubInvitation(p, c, "pending");
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.update(ci);
        trans.commit();
        return;
    }
    
    public ArrayList<ClubInvitation> getAllPendingClubInvitation(){
        Query query = session.createQuery("from ClubInvitation ci where ci.paticipant.id =" 
                + Navigator.getPaticipantLogin().getId()
                + " and status = 'pending'");
        ArrayList<ClubInvitation> result = (ArrayList<ClubInvitation>)query.getResultList();
        return result;
    }
    
    public void acceptJoinClub(ClubInvitation ci){
       ci.getClub().getListPaticipant().add(ci.getPaticipant());
       ci.setStatus("accepted");
       Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.update(ci);
        session.update(ci.getClub());
        trans.commit();
    }
    
    public void denyJoinClub(ClubInvitation ci){
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.delete(ci);
        trans.commit();
        return;
    }
    
    public void deleteClub(Club c){
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.delete(c);
        trans.commit();
        return;
    }
    
}
