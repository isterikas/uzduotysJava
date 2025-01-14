import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product result;
        while (true) {
            System.out.println("Please provide information on the type of product:");
            System.out.println("Press R for regular product, D for drug, W for wine, A for any other alcoholic beverage");
            String type = String.valueOf(scanner.nextLine());
            if (type.isEmpty()) {
                break;
            } else {
                System.out.println("Name of the product:");
                String name = String.valueOf(scanner.nextLine());
                System.out.println("Net price of the product:");
                double netPrice = Double.parseDouble(scanner.nextLine());
                if (type.equals("R")) {
                    result = new RegularProduct(name, netPrice);
                    System.out.println(result.getFinalPrice());
                    break;
                } else if (type.equals("D")) {
                    result = new Drug(name, netPrice);
                    System.out.println(result.printFinalPrice());
                    break;
                } else {
                    System.out.println("Alcohol percentage:");
                    double percentage = Double.parseDouble(scanner.nextLine());
                    System.out.println("Volume (in liters):");
                    double volume = Double.parseDouble(scanner.nextLine());
                    if (type.equals("W")) {
                        result = new Wine(name, netPrice, percentage, volume);
                        System.out.println(result.getFinalPrice());
                        break;
                    } else {
                        result = new AlcBeverage(name, netPrice, percentage, volume);
                        System.out.println(result.getFinalPrice());
                        break;
                    }
                }
            }
        }
    }
}