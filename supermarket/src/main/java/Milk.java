public class Milk extends Product{
    private String type;
    public Milk(String name, double price) {
        super(name, price);
        type = "milk";
    }
    public String getType(){
        return type;
    }
}
