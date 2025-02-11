import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
        printPersons(persons);
    }

    public static void printPersons(ArrayList<Person> arrayList) {
        for (Person person : arrayList) {
            System.out.println(person);
        }
    }

}
