package lld.prototype;

public class General extends GameUnit{
    private String state = "idle";

    public void boostMorale(){
        this.state = "boosting-morale";
    }

    //Not Cloneable
    @Override
    public GameUnit clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Generals can not be copied");
    }

    @Override
    public String toString(){
        return "General - " + state + " @ " + getPosition();
    }

    @Override
    protected void reset(){
        throw new UnsupportedOperationException("Generals can not be reset");
    }
}
