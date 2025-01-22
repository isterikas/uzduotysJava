public class Main {
    public static void main(String[] args) throws Exception {
        CashRegister cashRegister = new CashRegister();
        ProductStorage productStorage = new ProductStorage();
        Apple apple = new Apple("Golden", 1);
        Milk milk = new Milk("Dvaro", 2);
        Bread bread = new Bread("Birzu", 3);
        milk.setQuantity(3);
        apple.setQuantity(3);
        bread.setQuantity(3);
        SupermarketServiceImpl koops = SupermarketServiceImpl.getInstance();
        koops.restock(apple);
        koops.restock(milk);
        koops.restock(bread);
        initial(koops);
        koops.sell();
        System.out.println("Thank you, come again!");
    }
    public static void initial(SupermarketServiceImpl supermarketServiceImpl) {
        System.out.println();
        System.out.println("Welcome to TECHIN Supermarket!");
        System.out.println();
        System.out.println("Initial Product Inventory:");
        System.out.println("====================================");
       supermarketServiceImpl.stockInfo();
        System.out.println("====================================");
        System.out.println("Initial Cash Inventory:");
        System.out.println("====================================");
        supermarketServiceImpl.getCashRegister();
        System.out.println("====================================");
    }

}
