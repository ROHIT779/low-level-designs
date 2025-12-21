package lld.solid.open_closed.solution;

public class OpenClosedClient {

    public static void main(String[] args){
        PhoneSubscriber phoneSubscriber = new PhoneSubscriber();
        phoneSubscriber.subscriberID = "phone123";
        phoneSubscriber.phoneNumber = "9876543210";
        phoneSubscriber.duration = 200;
        double phoneBill = phoneSubscriber.calculateBill();

        ISPSubscriber ispSubscriber = new ISPSubscriber();
        ispSubscriber.subscriberID = "isp123";
        ispSubscriber.duration = 600;
        double ispBill = ispSubscriber.calculateBill();

        System.out.println("Phone Bill: " + Double.toString(phoneBill));
        System.out.println("Internet Bill: " + Double.toString(ispBill));
    }
}
