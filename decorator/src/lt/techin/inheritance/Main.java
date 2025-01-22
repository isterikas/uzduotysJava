package lt.techin.inheritance;

public class Main {
    public static void main(String[] args) {
        Greeter greeter = new GreeterImpl();
        Greeter upper = new GreeterUpperCase(greeter);
        upper.greet("John", "Johnson");
    }
}
