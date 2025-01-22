package lt.techin.strategy;

public class Main {
    public static void main(String[] args) {
        Greeter labas = new Greeter(new LithuanianGreetingStrategy(), new EndingStrategyExclamation());
        labas.greet("John", "Johnson");
    }
}