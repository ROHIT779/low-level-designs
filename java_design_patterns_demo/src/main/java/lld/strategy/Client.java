package lld.strategy;

import java.util.LinkedList;

public class Client {

    private static LinkedList<Order> orders = new LinkedList<>();

    public static void main(String[] args){
        createOrders();
        PrintService service = new PrintService(new SummaryPrinter());
        service.printOrders(orders);

        service = new PrintService(new DetailPrinter());
        service.printOrders(orders);
    }

    private static void createOrders(){
        Order o = new Order("100");
        o.addItem("Soda", 50);
        o.addItem("Chips", 20);

        orders.add(o);

        o = new Order("200");
        o.addItem("Cake", 80);
        o.addItem("Cookies", 10);

        orders.add(o);

        o = new Order("300");
        o.addItem("Burger", 150);
        o.addItem("Fries", 100);

        orders.add(o);
    }
}
