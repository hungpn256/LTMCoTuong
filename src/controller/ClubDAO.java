/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.DAO.session;
import model.Club;
import model.ClubInvitation;
import model.Paticipant;
import org.hibernate.Transaction;
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
    
    public void updatedClub(Club club){
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.update(club);
        trans.commit();
        return;
    }
    
    public void inviteJoinClub(Paticipant p){
        
    }
    
    public void acceptJoinClub(ClubInvitation ci){
        
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
