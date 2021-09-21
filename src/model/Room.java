/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.security.Timestamp;
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
@Table(name = "tblRoom")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    
    @ManyToOne
    @JoinColumn(name = "createdBy")
    private Paticipant createdBy;
    
    @ManyToOne
    @JoinColumn(name = "tournamentID")
    private Tournament tournament;
    
    @Column(name = "createdAt")
    private Timestamp createdAt;
    
    @Column(name = "status")
    private String status;
    
    @Column(name = "roomType")
    private String roomType;
    
    @OneToMany(mappedBy = "room")
    private List<Match> Match;

    public Room() {
    }

    public Room(long id, Paticipant createdBy, Tournament tournament, Timestamp createdAt, String status, String roomType, List<Match> Match) {
        this.id = id;
        this.createdBy = createdBy;
        this.tournament = tournament;
        this.createdAt = createdAt;
        this.status = status;
        this.roomType = roomType;
        this.Match = Match;
    }

    public Room(Paticipant createdBy, Tournament tournament, Timestamp createdAt, String status, String roomType, List<Match> Match) {
        this.createdBy = createdBy;
        this.tournament = tournament;
        this.createdAt = createdAt;
        this.status = status;
        this.roomType = roomType;
        this.Match = Match;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Paticipant getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Paticipant createdBy) {
        this.createdBy = createdBy;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public List<Match> getMatch() {
        return Match;
    }

    public void setMatch(List<Match> Match) {
        this.Match = Match;
    }
    
    

}
