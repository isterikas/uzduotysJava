package lt.techin.template;

public class Main {
    public static void main(String[] args) {
        LithuanianGreeter labas = new LithuanianGreeter(new Exclamation());
        labas.greet("John", "Johnson");
    }
}
