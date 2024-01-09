package org.example.snakesandladders.executors;

import org.example.snakesandladders.models.Ladder;
import org.example.snakesandladders.models.Player;
import org.example.snakesandladders.models.Snake;
import org.example.snakesandladders.models.SnakesAndLaddersGame;
import org.example.snakesandladders.operations.SnakesAndLaddersGameOperation;
import org.example.snakesandladders.operations.SnakesAndLaddersGameOperationImpl;
import org.example.snakesandladders.validators.SnakesAndLaddersValidator;

import java.util.Scanner;

public class SnakesAndLaddersExecutor {
    public void execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of snakes on the board...");
        int snakesLength=scanner.nextInt();
        Snake[] snakes=new Snake[snakesLength];
        for(int i=0;i<snakesLength;i++){
            System.out.println("Enter "+i+"-th snake's head and tail(head > tail)...");
            int headPosition=scanner.nextInt();
            int tailPosition=scanner.nextInt();
            Snake snake = new Snake(headPosition,tailPosition);
            snakes[i]=snake;
        }
        System.out.println("Enter number of ladders on the board...");
        int laddersLength=scanner.nextInt();
        Ladder[] ladders=new Ladder[laddersLength];
        for(int i=0;i<laddersLength;i++){
            System.out.println("Enter "+i+"-th ladder's top and bottom(top > bottom)...");
            int topPosition=scanner.nextInt();
            int bottomPosition=scanner.nextInt();
            Ladder ladder = new Ladder(topPosition,bottomPosition);
            ladders[i]=ladder;
        }
        System.out.println("Enter number of players...");
        int playersLength=scanner.nextInt();
        Player[] players=new Player[playersLength];
        for(int i=0;i<playersLength;i++){
            System.out.println("Enter player "+i+"-th name...");
            String playerName=scanner.next();
            Player player=new Player(playerName,0);
            players[i]=player;
        }
        SnakesAndLaddersValidator validator = new SnakesAndLaddersValidator();
        if(validator.validateSnakes(snakes) && validator.validateLadders(ladders)){
            SnakesAndLaddersGame snakesAndLaddersGame=new SnakesAndLaddersGame(snakes,ladders,players);
            SnakesAndLaddersGameOperation operation=new SnakesAndLaddersGameOperationImpl(snakesAndLaddersGame);
            operation.playGame();
        }

    }
}
