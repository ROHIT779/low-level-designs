package org.example.snakesandladders.models;

public class SnakesAndLaddersGame {
    private Snake[] snakes;
    private Ladder[] ladders;
    private Player[] players;
    private boolean isGameFinished=false;

    public static final int FINAL_POSITION=100;
    public SnakesAndLaddersGame(){};
    public SnakesAndLaddersGame(Snake[] snakes, Ladder[] ladders, Player[] players){
        this.snakes=snakes;
        this.ladders=ladders;
        this.players=players;
    }
    public Snake[] getSnakes(){
        return snakes;
    }
    public Ladder[] getLadders(){
        return ladders;
    }
    public Player[] getPlayers(){
        return players;
    }
    public boolean getIsGameFinished(){
        return isGameFinished;
    }
    public void setIsGameFinished(){
        isGameFinished=true;
    }
}
