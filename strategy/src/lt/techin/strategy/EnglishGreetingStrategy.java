package lt.techin.strategy;

public class EnglishGreetingStrategy implements GreeterLanguageStrategy {
    @Override
    public String getGreetingString() {
        return "Hello, ";
    }
}
