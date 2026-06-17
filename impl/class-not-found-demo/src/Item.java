public class Item{
    private int itemId;
    private String itemName;
    private double itemPrice;

    public Item(){}

    public Item(int id, String name, double price){
        this.itemId=id;
        this.itemName=name;
        this.itemPrice=price;
    }

    public int getItemId(){
        return itemId;
    }

    public String getItemName(){
        return itemName;
    }

    public double getItemPrice(){
        return itemPrice;
    }

    public String toString(){
        return "Item[id: "+itemId+", name: "+itemName+", price: "+itemPrice+"]";
    }
}