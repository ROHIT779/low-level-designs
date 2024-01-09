package org.example.snakesandladders.models;

public class Ladder {
    private int top;
    private int bottom;
    public Ladder(){};
    public Ladder(int top, int bottom){
        this.top=top;
        this.bottom=bottom;
    }
    public int getTop(){
        return top;
    }
    public int getBottom(){
        return bottom;
    }
}
