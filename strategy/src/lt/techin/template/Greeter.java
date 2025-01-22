package lt.techin.template;

public abstract class Greeter {
private Ending ending;
public Greeter(Ending ending){
    this.ending = ending;
}
    public void greet (String firstName, String lastname){
        System.out.println(getGreetingString()+firstName+" "+lastname+ending.getEnding());
    }
abstract String getGreetingString();

}
