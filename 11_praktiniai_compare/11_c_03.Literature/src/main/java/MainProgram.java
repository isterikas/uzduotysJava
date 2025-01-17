
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = String.valueOf(scanner.nextLine());
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation:");
            int age = Integer.parseInt(scanner.nextLine());
            books.add(new Book(name, age));
        }
        System.out.println(books.size() + " books in total.");
        System.out.println("Books:");
//        books.forEach(System.out::println);
        Comparator<Book> comparator = (a, b) -> a.getAge() - b.getAge();
        books.stream().sorted(comparator.thenComparing(Comparator.comparing(Book::getName))).forEach(System.out::println);
    }
}
