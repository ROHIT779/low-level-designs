import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args){
        Product p1=new Product(100,1,ProductCategory.CLOTHING,"Shirt",1250.0);
        Product p2=new Product(50,2,ProductCategory.CLOTHING,"Jeans",2500.5);
        Product p3=new Product(200,3,ProductCategory.ELECTRONICS,"Mobile",21370.5);
        Product p4=new Product(500,4,ProductCategory.SPORTS_AND_FITNESS,"Football",1750.75);
        Product p5=new Product(70,5,ProductCategory.OTHERS,"Home Decor",200.0);

        List<Product> productsOrdered = List.of(p1,p3,p5);
        double orderAmount = productsOrdered.stream().map(p -> p.getPrice()).reduce(0.0,(pa,pb)->pa+pb);

        Order order = new Order(1, productsOrdered, OrderStatus.PAID, orderAmount);

        InventoryService inventoryService = new InventoryService(order);
        ShippingService shippingService = new ShippingService(order);
        MessageService messageService = new MessageService(order);

        try{
            ExecutorService executorService = Executors.newFixedThreadPool(3);
            Future<Boolean> inventoryServiceFuture = executorService.submit(inventoryService);
            Future<Boolean> shippingServiceFuture = executorService.submit(shippingService);
            executorService.submit(messageService);
            System.out.println("Response from Inventory Service: "+ inventoryServiceFuture.get());
            boolean shippingServiceResponse = shippingServiceFuture.get();
            System.out.println("Response from Shipping Service: "+ shippingServiceResponse);
            if(shippingServiceResponse){
                executorService.submit(messageService);
            }
            executorService.shutdown();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
