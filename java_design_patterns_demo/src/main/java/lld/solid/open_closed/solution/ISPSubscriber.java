package lld.solid.open_closed.solution;

public class ISPSubscriber extends Subscriber {

    public double calculateBill(){
        double rate = Rate.rates.get(Type.ISP);
        return this.duration * rate;
    }
}
