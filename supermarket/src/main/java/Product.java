public class Product {
    private String name;
    private double price;
    private int quantity;
public Product(String name, double price){
    this.name = name;
    this.price = price;
}
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void sell(){
        quantity-=1;
    }
    public void setQuantity(int quantity){
    this.quantity = quantity;
    }

    public String getType() {
        return "";
    }
}
