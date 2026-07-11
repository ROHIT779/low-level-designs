import java.util.concurrent.Callable;

public class InventoryService implements Callable {

    private final Order order;

    InventoryService(Order order){
        this.order = order;
    }
    @Override
    public Object call() throws Exception {
        System.out.println("Thread "+Thread.currentThread().getName()+" for Inventory Service has started...");
        Thread.sleep(5000);
        System.out.println("Stocks of products with Order ID " + order.getOrderId() + " will be reduced...");
        return reduceStocks();
    }

    private boolean reduceStocks(){
        if(order.getStatus()==OrderStatus.PAID){
            for(Product product : order.getProducts()){
                product.reduceStock();
            }
            return true;
        }
        return false;
    }

}
