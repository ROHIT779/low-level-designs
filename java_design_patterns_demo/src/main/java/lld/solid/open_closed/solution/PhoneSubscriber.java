package lld.solid.open_closed.solution;

public class PhoneSubscriber extends Subscriber{
    String phoneNumber;

    @Override
    public double calculateBill(){
        double rate = Rate.rates.get(Type.PHONE);
        return this.duration * rate;
    }

}
