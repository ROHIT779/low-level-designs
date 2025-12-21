package lld.solid.open_closed.solution;

// Base Class
public abstract class Subscriber {
    String subscriberID;
    double duration;

    public abstract double calculateBill();
}
