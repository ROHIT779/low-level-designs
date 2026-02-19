package lld.strategy;

import java.util.Collection;
import java.util.Iterator;

public class DetailPrinter implements OrderPrinter{

    @Override
    public void print(Collection<Order> orders) {
        Iterator<Order> iterator = orders.iterator();
        System.out.println("************************* Orders Detail Report **************************");
        double total = 0;
        for(int i = 1; iterator.hasNext(); i++){
            Order order = iterator.next();
            double orderTotal = order.getTotal();
            total += orderTotal;
            System.out.println(i + ". Order ID: " +  order.getId()+ ", Date: " + order.getDate());
            for(String itemName : order.getItems().keySet()){
                System.out.println("\t\t\t\tItem: " + itemName + ", Price: " + order.getItems().get(itemName));
            }
            System.out.println("--------------------------------------------");
            System.out.println("\t\t\t\t\t\tOrder Total: " + orderTotal);
        }
        System.out.println("**********************************************");
        System.out.println("\t\t\t\t\t\tTotal Amount: " + total);
    }
}
