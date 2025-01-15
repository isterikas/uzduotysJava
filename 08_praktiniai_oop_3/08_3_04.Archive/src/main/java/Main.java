
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArchiveItem> archiveItems = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = String.valueOf(scanner.nextLine());
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = String.valueOf(scanner.nextLine());
            if (name.isEmpty()) {
                break;
            }
            ArchiveItem archiveItem = new ArchiveItem(identifier, name);
            if (!archiveItems.contains(archiveItem)) archiveItems.add(archiveItem);
        }

        System.out.println("==Items==");
        for (ArchiveItem archiveItem : archiveItems) {
            System.out.println(archiveItem);
        }


    }
}
