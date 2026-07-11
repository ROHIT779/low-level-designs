public class Product {
    private int productId;
    private ProductCategory category;
    private String name;
    private double price;
    private long stock;

    public Product(long stock, int productId, ProductCategory category, String name, double price) {
        this.stock = stock;
        this.productId = productId;
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void reduceStock(){
        this.stock--;
    }
}
