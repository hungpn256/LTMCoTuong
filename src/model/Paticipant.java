/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author phamhung
 */
@Entity
@Table(name = "tblPaticipant")
public class Paticipant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "nickName")
    private String nickName;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "clubID", nullable = true)
    private Club club;
//	
    @ManyToOne
    @JoinColumn(name = "tounamentID", nullable = true)
    private Tournament tournament;
    
    @OneToMany(mappedBy = "paticipant")
    private List<Friend> listFriend;

    public Paticipant() {
        // TODO Auto-generated constructor stub
    }

    
    public Paticipant(long id, String username, String password, String nickName, String status, Timestamp lastTimeIn,
            Timestamp lastTimeOut, Club club, Tournament tournament,ArrayList<Friend> listFriend) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickName = nickName;
        this.status = status;
        this.club = club;
        this.tournament = tournament;
        this.listFriend = listFriend;
    }

    public Paticipant(String username, String password, String nickName, String status, Timestamp lastTimeIn,
            Timestamp lastTimeOut, Club club, Tournament tournament,ArrayList<Friend> listFriend) {
        super();
        this.username = username;
        this.password = password;
        this.nickName = nickName;
        this.status = status;
        this.club = club;
        this.tournament = tournament;
        this.listFriend = listFriend;

    }

    public Paticipant(String username, String password, String nickName) {
        super();
        this.username = username;
        this.password = password;
        this.nickName = nickName;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }
    public List<Friend> getListFriend() {
        return listFriend;
    }

    public void setListFriend(List<Friend> listFriend) {
        this.listFriend = listFriend;
    }


}
