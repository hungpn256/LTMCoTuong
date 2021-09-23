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
    private int rankWonRate;
    private int rankWonRateRival;
    private int rankWonGame;
    private int rankTournament;

    public PaticipantStat() {
    }

    public PaticipantStat(int rankWonRate, int rankWonRateRival, int rankWonGame, int rankTournament) {
        this.rankWonRate = rankWonRate;
        this.rankWonRateRival = rankWonRateRival;
        this.rankWonGame = rankWonGame;
        this.rankTournament = rankTournament;
    }

    public int getRankWonRate() {
        return rankWonRate;
    }

    public void setRankWonRate(int rankWonRate) {
        this.rankWonRate = rankWonRate;
    }

    public int getRankWonRateRival() {
        return rankWonRateRival;
    }

    public void setRankWonRateRival(int rankWonRateRival) {
        this.rankWonRateRival = rankWonRateRival;
    }

    public int getRankWonGame() {
        return rankWonGame;
    }

    public void setRankWonGame(int rankWonGame) {
        this.rankWonGame = rankWonGame;
    }

    public int getRankTournament() {
        return rankTournament;
    }

    public void setRankTournament(int rankTournament) {
        this.rankTournament = rankTournament;
    }

    
}
