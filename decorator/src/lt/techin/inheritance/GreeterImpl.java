package lt.techin.inheritance;

public class GreeterImpl extends Greeter {
    @Override
    void greet(String firstName, String lastName) {
        System.out.println("Hello, " + firstName + " " + lastName);
    }
}
