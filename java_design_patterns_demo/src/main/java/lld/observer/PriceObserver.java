package lld.observer;

public class PriceObserver implements OrderObserver{

    private static final double basePrice = 1000;

    @Override
    public void updated(Order order){
        double total = order.getTotal();
        if(total > basePrice){
            order.setDiscount(20);
        } else if(total > (basePrice/2)){
            order.setDiscount(10);
        }
    }
}
