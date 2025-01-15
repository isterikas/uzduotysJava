import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people = new ArrayList<>();

    public Room() {
    }

    public void add(Person person) {
        people.add(person);
    }

    public boolean isEmpty() {
        return people.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return people;
    }

    public Person shortest() {
        if (people.isEmpty()) return null;
        Person shortest = new Person("A", 1);
        int height = 300;
        for (Person person : people) {
            height = Math.min(person.getHeight(), height);
            shortest = person.getHeight() <= height ? person : shortest;
        }
        return shortest;
    }

    public Person take() {
        if (people.isEmpty()) return null;
        Person shortest = shortest();
        people.remove(shortest());
        return shortest;
    }
}
