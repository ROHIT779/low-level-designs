package lld.observer;

public class QuantityObserver implements OrderObserver{

    private static final int baseQuantity = 2;

    @Override
    public void updated(Order order){
        int count = order.getCount();
        if(count <= baseQuantity){
            order.setShippingCost(10);
        } else {
            order.setShippingCost(10 + (count - baseQuantity) * 0.5);
        }
    }
}
