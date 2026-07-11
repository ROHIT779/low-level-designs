public class MessageService implements Runnable{

    private final Order order;

    MessageService(Order order){
        this.order = order;
    }
    @Override
    public void run() {
        System.out.println("Thread "+Thread.currentThread().getName()+" for Message Service has started...");
        try{
            Thread.sleep(1000);
            String message = "Your order with Order ID "+order.getOrderId()+" has been "+order.getStatus();
            System.out.println(message);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
