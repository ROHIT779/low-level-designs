package org.example.snakesandladders.operations;

import org.example.snakesandladders.models.Ladder;
import org.example.snakesandladders.models.Player;
import org.example.snakesandladders.models.Snake;
import org.example.snakesandladders.models.SnakesAndLaddersGame;

import java.util.Random;

public class SnakesAndLaddersGameOperationImpl implements SnakesAndLaddersGameOperation {

    private int diceValue;
    private SnakesAndLaddersGame snakesAndLaddersGame;
    private String gameWorkflow="";

    public SnakesAndLaddersGameOperationImpl(){};
    public SnakesAndLaddersGameOperationImpl(SnakesAndLaddersGame game){
        this.snakesAndLaddersGame=game;
    }

    @Override
    public Player playGame() {
        Player winner = null;
        Ladder[] ladders = snakesAndLaddersGame.getLadders();
        Snake[] snakes = snakesAndLaddersGame.getSnakes();
        Player[] players= snakesAndLaddersGame.getPlayers();
        Random random=new Random();
        while(!snakesAndLaddersGame.getIsGameFinished()){
            for(int i=0;i< players.length;i++){
                diceValue=throwDice(random);
                System.out.println("Player name: "+players[i].getPlayerName()+" Player position: "+players[i].getPlayerPosition()+" hasStarted: "+players[i].getHasStarted());
                System.out.println("Dice value: "+diceValue);
                if(!players[i].getHasStarted() && diceValue==1){
                    players[i].setHasStarted();
                }
                if(players[i].getHasStarted()){
                    movePlayer(players[i],diceValue);
                    System.out.println(players[i].getPlayerName()+"'s new position: "+players[i].getPlayerPosition());
                    for(int j=0;j< ladders.length;j++){
                        if(players[i].getPlayerPosition()==ladders[j].getBottom()){
                            System.out.println("Player got ladder from "+players[i].getPlayerPosition()+" to "+ladders[j].getTop());
                            players[i].setPlayerPosition(ladders[j].getTop());
                            break;
                        }
                    }
                    for(int j=0;j< snakes.length;j++){
                        if(players[i].getPlayerPosition()==snakes[j].getHead()){
                            System.out.println("Player bitten by snake from "+players[i].getPlayerPosition()+" to "+snakes[j].getTail());
                            players[i].setPlayerPosition(snakes[j].getTail());
                            break;
                        }
                    }
                }
                if(isPlayerPositionFinal(players[i])){
                    winner=players[i];
                    System.out.println("Winner of the Game is: "+players[i].getPlayerName()+" Congratulations!!!\n");
                    snakesAndLaddersGame.setIsGameFinished();
                    break;
                }
            }
        }
        System.out.println("-------Final Score-------");
        for(Player player : players){
            System.out.print(player.getPlayerName()+": "+player.getPlayerPosition());
            System.out.println();
        }
        return winner;
    }
//    public void setGameWorkflowString(String s){
//        gameWorkflow+=s;
//    }
//    public void getGameWorkflow(){
//        System.out.print(gameWorkflow);
//    }
    public boolean isPlayerPositionFinal(Player player){
        if(player.getPlayerPosition()==SnakesAndLaddersGame.FINAL_POSITION){
            return true;
        }else{
            return false;
        }
    }
    public Player movePlayer(Player player, int diceValue){
        if(player.getPlayerPosition()+diceValue<=100){
            player.setPlayerPosition(player.getPlayerPosition()+diceValue);
        }
        return player;
    }
    public int throwDice(Random random){
        diceValue=random.nextInt(6)+1;
        return diceValue;
    }
    public int getDiceValue(Random random){
        return diceValue;
    }
}
