package lt.techin.oop;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String fur = hasFur ? "a fur." : "no fur.";
        String paws = numberOfPaws > 1 ? " paws and " : " paw and ";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + paws + fur;
    }
}
