/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Paticipant;
import org.hibernate.Transaction;
import view.Navigator;

/**
 *
 * @author phamhung
 */
public class PaticipantDAO extends DAO {
    public PaticipantDAO() {
        super();
    }

    /**
     * search all clients in the tblClient whose name contains the @key
     *
     * @param key
     * @return list of client whose name contains the @key
     */
    @SuppressWarnings("unchecked")
    public ArrayList<Paticipant> searchPaticipant(String key) {
        ArrayList<Paticipant> result = (ArrayList<Paticipant>) session.createQuery("from Paticipant where name like '%" + key + "%'").list();
        return result;
    }
    
    public void update(Paticipant p) {
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.update(p);
        trans.commit();
        return;
    }

    public void register(Paticipant p) {
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.save(p);
        trans.commit();
        return;
    }

    public Paticipant login(Paticipant p) throws Exception {
        Paticipant res = (Paticipant) session.createQuery("from Paticipant where username = '" + p.getUsername() + "' and password = '"+p.getPassword()+"'").getSingleResult();
        if(res==null)
            throw new Exception("tai khoan mat khau khong chinh xac");
        res.setStatus("online");
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.update(res);
        trans.commit();
        return res;
    }
    
    public void logout(Paticipant p) throws Exception {
        p.setStatus("offline");
        Transaction trans = session.getTransaction();
        if (!trans.isActive()) {
            trans.begin();
        }
        session.update(p);
        trans.commit();
    }
}
