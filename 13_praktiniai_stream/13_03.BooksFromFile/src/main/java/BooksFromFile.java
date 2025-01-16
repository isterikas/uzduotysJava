
import lt.techin.book.Book;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        System.out.println(readBooks("/Users/JOHNJOHNSON/Desktop/uzduotys/13_praktiniai_stream/13_03.BooksFromFile/src/main/java/books.txt"));

    }

    public static List<Book> readBooks(String file){
        try {
            File fileToRead = new File(file);
            Scanner myReader = new Scanner(fileToRead);
            if (fileToRead.exists()) {
                return Files.lines(Paths.get(file))
                        .map(line -> line.split(","))
                        .map(info -> new Book(info[0],
                                Integer.parseInt(info[1]),
                                Integer.parseInt(info[2]),
                                info[3]))
                        .collect(Collectors.toList());

            } else {
                System.out.println("The file does not exist.");
                return null;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
