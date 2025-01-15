
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);
        Item book = new Item("Lord of the rings", 2);
        Suitcase suitcase1 = new Suitcase(10);
        Suitcase suitcase2 = new Suitcase(3);
        suitcase1.addItem(phone);
        suitcase1.addItem(brick);
        suitcase1.addItem(book);
        suitcase2.addItem(phone);
        suitcase2.addItem(book);
        Hold hold = new Hold(20);
        hold.addSuitcase(suitcase1);
        hold.addSuitcase(suitcase2);
        hold.printItems();
    }

}
