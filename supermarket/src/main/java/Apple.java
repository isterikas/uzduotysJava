public class Apple extends Product{
    private String type;
    public Apple(String name, double price) {
        super(name, price);
        type = "apple";
    }
    public String getType(){
        return type;
    }
}
