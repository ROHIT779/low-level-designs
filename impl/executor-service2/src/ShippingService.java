import java.util.concurrent.Callable;

public class ShippingService implements Callable {

    private final Order order;

    ShippingService(Order order){
        this.order = order;
    }
    @Override
    public Object call() throws Exception {
        System.out.println("Thread "+Thread.currentThread().getName()+" for Shipping Service has started...");
        Thread.sleep(5000);
        return addOrderInQueue();
    }

    private boolean addOrderInQueue(){
        if(order.getStatus()==OrderStatus.PAID){
            System.out.println("Order with order ID " + order.getOrderId()+ " is going to be shipped");
            order.setStatus(OrderStatus.PLACED);
            return true;
        }
        return false;
    }
}
