package lld.strategy;

import java.util.Collection;
import java.util.Iterator;

// Concrete Strategy
public class SummaryPrinter implements OrderPrinter{

    @Override
    public void print(Collection<Order> orders) {
        Iterator<Order> iterator = orders.iterator();
        System.out.println("************************* Orders Summary Report **************************");
        double total = 0;
        for(int i = 1; iterator.hasNext(); i++){
            Order order = iterator.next();
            double orderTotal = order.getTotal();
            total += orderTotal;
            System.out.println(i + ". Order ID: " +  order.getId()+ ", Date: " + order.getDate() +
                    ", Number of items: " + order.getItems().size() + ", Order Total: " + orderTotal);
        }
        System.out.println("**************************************************************************");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tTotal Amount: " + total);
    }
}
