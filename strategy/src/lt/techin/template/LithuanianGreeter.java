package lt.techin.template;

public class LithuanianGreeter extends Greeter{
    public LithuanianGreeter(Ending ending) {
        super(ending);
    }

    @Override
    String getGreetingString() {
        return "Labas, ";
    }
}
