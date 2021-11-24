package com.example.quickscorecollector;

public class Team {

    private String teamId;
    private String teamName;
    private String teamNameShort;
    private int playedGames;
    private int gamesWon;
    private int gamesLost;
    private int tablePoints;
    private int pointsScored;
    private int pointsConceded;
    private int pointsPerGame;
    private int pointsDifference;
    private int streak;

    public Team() {
    }

    public Team(String teamId, String teamName, String teamNameShort, int playedGames, int gamesWon,
                int gamesLost, int tablePoints, int pointsScored, int pointsConceded,
                int pointsPerGame, int pointsDifference, int streak) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamNameShort = teamNameShort;
        this.playedGames = playedGames;
        this.gamesWon = gamesWon;
        this.gamesLost = gamesLost;
        this.tablePoints = tablePoints;
        this.pointsScored = pointsScored;
        this.pointsConceded = pointsConceded;
        this.pointsPerGame = pointsPerGame;
        this.pointsDifference = pointsDifference;
        this.streak = streak;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamNameShort() {
        return teamNameShort;
    }

    public void setTeamNameShort(String teamNameShort) {
        this.teamNameShort = teamNameShort;
    }

    public int getPlayedGames() {
        return playedGames;
    }

    public void setPlayedGames(int playedGames) {
        this.playedGames = playedGames;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public int getTablePoints() {
        return tablePoints;
    }

    public void setTablePoints(int tablePoints) {
        this.tablePoints = tablePoints;
    }

    public int getPointsScored() {
        return pointsScored;
    }

    public void setPointsScored(int pointsScored) {
        this.pointsScored = pointsScored;
    }

    public int getPointsConceded() {
        return pointsConceded;
    }

    public void setPointsConceded(int pointsConceded) {
        this.pointsConceded = pointsConceded;
    }

    public int getPointsPerGame() {
        return pointsPerGame;
    }

    public void setPointsPerGame(int pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }

    public int getPointsDifference() {
        return pointsDifference;
    }

    public void setPointsDifference(int pointsDifference) {
        this.pointsDifference = pointsDifference;
    }

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }
}
