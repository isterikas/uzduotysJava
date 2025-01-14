import java.util.ArrayList;

public class Store {
    private ArrayList<Product> products = new ArrayList<>();

    public Store(){

    }

    public void addProduct(Product product){
        products.add(product);
    }

    public double getProductPrice(String name) {
        for (Product product : products) {
            if (name.equals(product.toString())) {
                return product.getFinalPrice();
            }
        }
        return -1;
    }}


