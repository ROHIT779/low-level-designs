package lld.solid.open_closed.problems;

public class PhoneSubscriber {
    String subscriberID;
    String phoneNumber;
    double duration;

    public double calculateBill(){
        double rate = Rate.rates.get(Type.PHONE);
        return this.duration * rate;
    }

}
