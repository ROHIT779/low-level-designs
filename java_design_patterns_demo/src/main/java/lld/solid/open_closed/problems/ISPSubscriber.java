package lld.solid.open_closed.problems;

public class ISPSubscriber {
    String subscriberID;
    double duration;

    public double calculateBill(){
        double rate = Rate.rates.get(Type.ISP);
        return this.duration * rate;
    }
}
