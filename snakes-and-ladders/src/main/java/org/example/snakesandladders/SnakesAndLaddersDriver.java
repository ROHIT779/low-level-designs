package org.example.snakesandladders;

import org.example.snakesandladders.executors.SnakesAndLaddersExecutor;
import org.example.snakesandladders.models.Ladder;
import org.example.snakesandladders.models.Player;
import org.example.snakesandladders.models.Snake;
import org.example.snakesandladders.models.SnakesAndLaddersGame;
import org.example.snakesandladders.operations.SnakesAndLaddersGameOperation;
import org.example.snakesandladders.operations.SnakesAndLaddersGameOperationImpl;

import java.util.Scanner;

public class SnakesAndLaddersDriver {
    public static void main(String[] args) {
        //Snake=head,tail
        //Ladder=top,bottom
        //snakes[] and ladders[]
        //initialize playerPosition=0
        //business logic: Result: For player[i] When playerPosition[i]==100 then player[i] WINs.
        //Take a random number from 1 to 6, assign it to diceVal. playerPosition+=diceValue.
        //loop through ladders and snakes. If playerPosition==ladder[i].bottom, then playerPosition=ladder[i].top
        //Else if playerPosition==snakes[i].head, then playerPosition=snakes[i].tail
        //If diceVal==1, player will start
        SnakesAndLaddersExecutor executor = new SnakesAndLaddersExecutor();
        executor.execute();
    }
}