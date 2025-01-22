package lt.techin.decorator;

public class Main {
    public static void main(String[] args) {
        Greeter johnny = new GreeterImpl();
        GreeterUpperCaseDecorator john = new GreeterUpperCaseDecorator(johnny);
        System.out.println(john.greet("John", "Johnson"));
    }
}