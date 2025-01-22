package lt.techin.strategy;

public class Greeter {
    private GreeterLanguageStrategy strategy;
    private EndingStrategy ending;

    public Greeter(GreeterLanguageStrategy strategy, EndingStrategy ending) {
        this.strategy = strategy;
        this.ending = ending;
    }

    public void greet(String firstName, String lastName) {
        System.out.println(strategy.getGreetingString() + firstName + " " + lastName + ending.getEnding());
    }
}
