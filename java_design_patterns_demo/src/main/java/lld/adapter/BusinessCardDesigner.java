package lld.adapter;

// Client code which uses Customer interface
public class BusinessCardDesigner {

    public String designCard(Customer customer){
        String card = "";
        card += customer.getName();
        card += "\n" + customer.getDesignation();
        card += "\nAddress: " + customer.getAddress();
        return card;
    }
}
