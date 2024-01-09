package org.example.snakesandladders.models;

public class Player {
    private String playerName;
    private int playerPosition;
    private boolean hasStarted;
    public Player(){};
    public Player(String playerName, int playerPosition){
        this.playerName=playerName;
        this.playerPosition=playerPosition;
        this.hasStarted=false;
    }
    public String getPlayerName(){
        return playerName;
    }
    public int getPlayerPosition(){
        return playerPosition;
    }
    public void setPlayerPosition(int playerPosition){
        this.playerPosition=playerPosition;
    }
    public boolean getHasStarted(){
        return hasStarted;
    }
    public void setHasStarted(){
        this.hasStarted=true;
    }
}
