package lld.strategy;

import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;

public class Order {
    private String id;
    private LocalDate date;
    private Map<String, Double> items = new HashMap<>();

    public Order(String id){
        this.id = id;
        this.date = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public double getTotal() {
        double total = 0;
        for(String itemName : items.keySet()){
            total += items.get(itemName);
        }
        return total;
    }

    public LocalDate getDate(){
        return date;
    }

    public void addItem(String item, double price){
        this.items.put(item, price);
    }
}
