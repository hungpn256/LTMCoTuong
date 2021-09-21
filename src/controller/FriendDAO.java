/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.DAO.session;
import java.util.ArrayList;
import javax.swing.table.TableCellRenderer;
import model.Friend;
import model.FriendInvitation;
import model.Paticipant;
import org.hibernate.query.Query;
import view.Navigator;

/**
 *
 * @author phamhung
 */
public class FriendDAO extends DAO {

    public FriendDAO() {
    }
    
    public ArrayList<Paticipant> searchAddFriend(String key) {
        Query query = session.createQuery("from Paticipant p where p.id != "+ Navigator.getPaticipantLogin().getId()
                + " and (p.username like '%" + key+"%'"+"or p.nickName like '%" + key+"%') and p.id NOT IN (SELECT f.paticipant.id from Friend f where f.friend.id = "+ Navigator.getPaticipantLogin().getId()+" )");
        ArrayList<Paticipant> result = (ArrayList<Paticipant>) query.getResultList();
        System.out.println(result.size()+"size friend");
        for (Paticipant paticipant : result) {
            System.out.println(paticipant.getId()+"object");
        }
        return result;
    }
    
    public void requestAddFriend(Paticipant fi) {
        Query query = session.createQuery("");
        ArrayList<Paticipant> result = (ArrayList<Paticipant>) query.getResultList();
        System.out.println(result.size()+"size friend");
        for (Paticipant paticipant : result) {
            System.out.println(paticipant.getId()+"object");
        }
        return;
    }
    
    public void acceptFriend(FriendInvitation fi) {
        Query query = session.createQuery("");
        ArrayList<Paticipant> result = (ArrayList<Paticipant>) query.getResultList();
        System.out.println(result.size()+"size friend");
        for (Paticipant paticipant : result) {
            System.out.println(paticipant.getId()+"object");
        }
        return;
    }
    
    public ArrayList<Friend> getAllPendingFriend() {
        Query query = session.createQuery("");
        ArrayList<Friend> result = (ArrayList<Friend>)query.getResultList();
        System.out.println(result.size()+"size friend");
        return result;
    }
    
    public void getAllFriend() {
        Query query = session.createQuery("");
        ArrayList<Paticipant> result = (ArrayList<Paticipant>) query.getResultList();
        System.out.println(result.size()+"size friend");
        for (Paticipant paticipant : result) {
            System.out.println(paticipant.getId()+"object");
        }
        return;
    }
    
    public void removeFriend(Friend f) {
        Query query = session.createQuery("");
        ArrayList<Paticipant> result = (ArrayList<Paticipant>) query.getResultList();
        System.out.println(result.size()+"size friend");
        for (Paticipant paticipant : result) {
            System.out.println(paticipant.getId()+"object");
        }
        return;
    }
    
}
