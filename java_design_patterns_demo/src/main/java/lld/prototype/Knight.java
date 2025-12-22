package lld.prototype;

public class Knight extends GameUnit{
    private String state = "idle";

    public void attack(){
        this.state = "attacking";
    }

    @Override
    public String toString(){
        return "Knight - " + state + " @ " + getPosition();
    }

    @Override
    protected void reset(){
        this.state = "idle";
    }
}
