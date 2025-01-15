import lt.techin.oop.Bird;
import lt.techin.oop.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());
    }
}
