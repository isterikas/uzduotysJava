public class Bread extends Product{
private String type;
    public Bread(String name, double price) {
        super(name, price);
        type = "bread";
    }
    public String getType(){
        return type;
    }
}
