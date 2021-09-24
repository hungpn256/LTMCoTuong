/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.swing.Timer;

/**
 *
 * @author phamhung
 */
@Entity
@Table(name = "tblMatch")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    
    @ManyToOne
    @JoinColumn(name = "roomId")
    private Room room;
    
    @Column(name="createdAt")
    private Timestamp createAt;
    
    @Column(name="endAt")
    private Timestamp endAt;
    
    @ManyToOne
    @JoinColumn(name = "gameTypeID")
    private GameType gameType;
    
    @OneToMany(mappedBy = "match",cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<PaticipantMatch> listPaticipantMatch = new ArrayList<>();;
    
    @OneToMany(mappedBy = "match",cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Movement> listMovement = new ArrayList<>();;

    public Match() {
    }

    public Match(long id, Room room, Timestamp createAt, Timestamp endAt, GameType gameType, List<PaticipantMatch> listPaticipantMatch, List<Movement> listMovement) {
        this.id = id;
        this.room = room;
        this.createAt = createAt;
        this.endAt = endAt;
        this.gameType = gameType;
        this.listPaticipantMatch = listPaticipantMatch;
        this.listMovement = listMovement;
    }

    public Match(Room room, Timestamp createAt, Timestamp endAt, GameType gameType, List<PaticipantMatch> listPaticipantMatch, List<Movement> listMovement) {
        this.room = room;
        this.createAt = createAt;
        this.endAt = endAt;
        this.gameType = gameType;
        this.listPaticipantMatch = listPaticipantMatch;
        this.listMovement = listMovement;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Timestamp getEndAt() {
        return endAt;
    }

    public void setEndAt(Timestamp endAt) {
        this.endAt = endAt;
    }

    public List<PaticipantMatch> getListPaticipantMatch() {
        return listPaticipantMatch;
    }

    public void setListPaticipantMatch(List<PaticipantMatch> listPaticipantMatch) {
        this.listPaticipantMatch = listPaticipantMatch;
    }

    public List<Movement> getListMovement() {
        return listMovement;
    }

    public void setListMovement(List<Movement> listMovement) {
        this.listMovement = listMovement;
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }
    
    
}
