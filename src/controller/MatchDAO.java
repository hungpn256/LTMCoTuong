/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.DAO.session;
import model.Match;
import model.Movement;
import model.Paticipant;
import org.hibernate.Transaction;
import view.Navigator;

/**
 *
 * @author phamhung
 */
public class MatchDAO {
    private Paticipant paticipant;

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
