
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your program here
//        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        int[] array = {1, 3, 5, 9};
        Scanner reader = new Scanner(System.in);

        System.out.print("Numbers in the array " + Arrays.toString(array));
        System.out.println();
        System.out.print("Enter searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));
        if (result) {
            System.out.println("Value " + searchedValue + " is in the array.");
        } else {
            System.out.println("Value " + searchedValue + " is not in the array.");
        }

        // Print here the result
    }
}
