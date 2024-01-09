package org.example.snakesandladders.validators;

import org.example.snakesandladders.models.Ladder;
import org.example.snakesandladders.models.Snake;

import java.util.List;

public class SnakesAndLaddersValidator {
    public boolean validateSnakes(Snake[] snakes){
        String validationErrorLog="";
        for(Snake snake : snakes){
            if(snake.getHead()<=snake.getTail()){
                validationErrorLog+="Head="+snake.getHead()+" Tail="+snake.getTail()+"\n";
            }
        }
        if(!validationErrorLog.equals("")){
            validationErrorLog="Invalid Snake values: Head is less than or equal to Tail\n"+validationErrorLog;
            System.out.println(validationErrorLog);
            return false;
        }
        return true;
    }

    public boolean validateLadders(Ladder[] ladders){
        String validationErrorLog="";
        for(Ladder ladder : ladders){
            if(ladder.getTop()<=ladder.getBottom()){
                validationErrorLog+="Top="+ladder.getTop()+" Bottom="+ladder.getBottom()+"\n";
            }
        }
        if(!validationErrorLog.equals("")){
            validationErrorLog="Invalid Ladder values: Top is less than or equal to Bottom\n"+validationErrorLog;
            System.out.println(validationErrorLog);
            return false;
        }
        return true;
    }
}
