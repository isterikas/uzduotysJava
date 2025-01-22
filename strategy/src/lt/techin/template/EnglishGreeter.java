package lt.techin.template;

public class EnglishGreeter extends Greeter{

    public EnglishGreeter(Ending ending) {
        super(ending);
    }

    @Override
    String getGreetingString() {
        return "Hello, ";
    }
}
