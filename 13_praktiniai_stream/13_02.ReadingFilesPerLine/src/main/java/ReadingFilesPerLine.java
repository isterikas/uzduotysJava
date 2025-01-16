
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        read("/Users/JOHNJOHNSON/Desktop/uzduotys/13_praktiniai_stream/13_02.ReadingFilesPerLine/src/main/java/file.txt");
    }

    public static <AbstractStringBuilder> List<String> read(String file) {
        List<String> lines = new ArrayList<>();

        try {
            File fileToRead = new File(file);
            Scanner myReader = new Scanner(fileToRead);
            String a = myReader.nextLine();
            if (fileToRead.exists()) {
                Files.lines(Paths.get(file)).map(row -> row.split("\\r?\\n")).forEach(string -> lines.add(string[0]));
                System.out.println(lines);
            } else {
                System.out.println("The file does not exist.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

}
