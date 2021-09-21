/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.security.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author phamhung
 */
@Entity
@Table(name = "tblClub")
public class Movement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    
    @ManyToOne
    @JoinColumn(name = "paticipantMathID")
    private PaticipantMatch paticipantMatch;
    
    @Column(name = "createdAt")
    private Timestamp createdAt;
    
    @Column(name = "isReturn")
    private int isReturn;
    
    @ManyToOne
    @JoinColumn(name = "matchID")
    private Match match;
    
    @Column(name = "chessName")
    private String chessName;
    
    @Column(name = "chessColor")
    private String chessColor;
    
    @Column(name = "startX")
    private int startX;
    
    @Column(name = "startY")
    private int startY;
    
    @Column(name = "endX")
    private int endX;
    
    @Column(name = "endY")
    private int endY;

    public Movement() {
    }

    public Movement(long id, PaticipantMatch paticipantMatch, Timestamp createdAt, int isReturn, Match match, String chessName, String chessColor, int startX, int startY, int endX, int endY) {
        this.id = id;
        this.paticipantMatch = paticipantMatch;
        this.createdAt = createdAt;
        this.isReturn = isReturn;
        this.match = match;
        this.chessName = chessName;
        this.chessColor = chessColor;
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public Movement(PaticipantMatch paticipantMatch, Timestamp createdAt, int isReturn, Match match, String chessName, String chessColor, int startX, int startY, int endX, int endY) {
        this.paticipantMatch = paticipantMatch;
        this.createdAt = createdAt;
        this.isReturn = isReturn;
        this.match = match;
        this.chessName = chessName;
        this.chessColor = chessColor;
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PaticipantMatch getPaticipantMatch() {
        return paticipantMatch;
    }

    public void setPaticipantMatch(PaticipantMatch paticipantMatch) {
        this.paticipantMatch = paticipantMatch;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public int getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(int isReturn) {
        this.isReturn = isReturn;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public String getChessName() {
        return chessName;
    }

    public void setChessName(String chessName) {
        this.chessName = chessName;
    }

    public String getChessColor() {
        return chessColor;
    }

    public void setChessColor(String chessColor) {
        this.chessColor = chessColor;
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }
    
    
    
}
