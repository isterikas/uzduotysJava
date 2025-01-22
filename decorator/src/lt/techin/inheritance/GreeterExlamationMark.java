package lt.techin.inheritance;

public class GreeterExlamationMark extends Greeter {
    private Greeter greeter;

    public GreeterExlamationMark(Greeter greeter) {
        this.greeter = greeter;
    }

    @Override
    void greet(String firstName, String lastName) {
        System.out.println("Hello, " + firstName + " " + lastName + "!");
    }
}
