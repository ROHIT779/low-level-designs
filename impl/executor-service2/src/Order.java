import java.util.List;

public class Order {
    private int orderId;
    private List<Product> products;
    private OrderStatus status;
    private double amount;

    public Order(int orderId, List<Product> products, OrderStatus status, double amount) {
        this.orderId = orderId;
        this.products = products;
        this.status = status;
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public double getAmount() {
        return amount;
    }

    public void setStatus(OrderStatus status){
        this.status=status;
    }
}
