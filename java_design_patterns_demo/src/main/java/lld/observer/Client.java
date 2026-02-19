package lld.observer;

public class Client {

    public static void main(String[] args){
        Order order = new Order("16");
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();
        order.attach(priceObserver);
        order.attach(quantityObserver);

        System.out.println("Added item worth Rs. 200");
        order.addItem(200);
        System.out.println(order);

        System.out.println("Added item worth Rs. 301");
        order.addItem(301);
        System.out.println(order);

        System.out.println("Added item worth Rs. 501");
        order.addItem(501);
        System.out.println(order);
    }
}
