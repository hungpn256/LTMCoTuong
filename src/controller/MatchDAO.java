/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.DAO.session;
import java.util.List;
import model.GameType;
import model.Match;
import model.Movement;
import model.Paticipant;
import model.PaticipantMatch;
import org.hibernate.Transaction;
import view.Navigator;

/**
 *
 * @author phamhung
 */
public class MatchDAO extends DAO{

    public MatchDAO() {
        
    }
    
    public void createMatch(Match match){
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.save(match);
        trans.commit();
        return;
    }
    
    public List<GameType> getAllGameType(){
        List<GameType> listGameType = (List<GameType>)session.createQuery("from GameType");
        return listGameType;
    }
    
    public void createPaticipantMatch(PaticipantMatch pm){
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.save(pm);
        trans.commit();
        return;
    }
    
    public void createMovement(Movement m){
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.save(m);
        trans.commit();
        return;
    }
    
    public void updateMovement(Movement m){
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.update(m);
        trans.commit();
        return;
    }
    
    public void updatePaticipantMatch(PaticipantMatch pm){
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.update(pm);
        trans.commit();
        return;
    }
    
    public void updateMatch(Match match){
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.update(match);
        trans.commit();
        return;
    }
}
