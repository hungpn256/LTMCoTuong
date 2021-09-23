/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author phamhung
 */
public class PaticipantStat {
    private int ranking;
    private int gamePlayed;
    private int tournamentPlayed;
    private int gameWon;
    private int tournamentWon;

    public PaticipantStat() {
    }

    public PaticipantStat(int ranking, int gamePlayed, int tournamentPlayed, int gameWon, int tournamentWon) {
        this.ranking = ranking;
        this.gamePlayed = gamePlayed;
        this.tournamentPlayed = tournamentPlayed;
        this.gameWon = gameWon;
        this.tournamentWon = tournamentWon;
    }

    public PaticipantStat(int gamePlayed, int tournamentPlayed, int gameWon, int tournamentWon) {
        this.gamePlayed = gamePlayed;
        this.tournamentPlayed = tournamentPlayed;
        this.gameWon = gameWon;
        this.tournamentWon = tournamentWon;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getGamePlayed() {
        return gamePlayed;
    }

    public void setGamePlayed(int gamePlayed) {
        this.gamePlayed = gamePlayed;
    }

    public int getTournamentPlayed() {
        return tournamentPlayed;
    }

    public void setTournamentPlayed(int tournamentPlayed) {
        this.tournamentPlayed = tournamentPlayed;
    }

    public int getGameWon() {
        return gameWon;
    }

    public void setGameWon(int gameWon) {
        this.gameWon = gameWon;
    }

    public int getTournamentWon() {
        return tournamentWon;
    }

    public void setTournamentWon(int tournamentWon) {
        this.tournamentWon = tournamentWon;
    }
}
