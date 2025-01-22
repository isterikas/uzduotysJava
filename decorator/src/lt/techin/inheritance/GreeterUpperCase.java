package lt.techin.inheritance;

public class GreeterUpperCase extends Greeter{
    private Greeter greeter;
    public GreeterUpperCase(Greeter greeter){
        this.greeter = greeter;
    }
    @Override
    void greet(String firstName, String lastName) {
        System.out.println(("Hello, "+firstName+" "+lastName).toUpperCase());
    }
}
