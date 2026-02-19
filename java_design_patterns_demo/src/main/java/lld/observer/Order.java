package lld.observer;

import java.util.ArrayList;
import java.util.List;

// Subject - Concrete class - Interface will be needed if our observers listen to
// multiple subjects
public class Order {

    private String id;

    //Cost of items
    private double itemCost;

    //No of items
    private int count;

    private int discount;

    private double shippingCost;

    private final List<OrderObserver> observers;

    public Order(String id){
        this.id = id;
        this.observers = new ArrayList<>();
    }

    public double getTotal(){
        return itemCost - discount + shippingCost;
    }

    public int getDiscount(){
        return discount;
    }

    public void setDiscount(int discount){
        this.discount = discount;
    }

    public double getShippingCost(){
        return this.shippingCost;
    }

    public void setShippingCost(double shippingCost){
        this.shippingCost = shippingCost;
    }

    public void addItem(double price){
        itemCost += price;
        count++;
        observers.forEach(o -> o.updated(this));
    }

    public int getCount(){
        return count;
    }

    // attaches an observer with the subject
    public void attach(OrderObserver observer){
        observers.add(observer);
    }

    // detaches an observer from the subject
    public void detach(OrderObserver observer){
        observers.remove(observer);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", itemCost=" + itemCost +
                ", count=" + count +
                ", discount=" + discount +
                ", shippingCost=" + shippingCost +
                ", final total=" + getTotal() +
                '}';
    }
}
