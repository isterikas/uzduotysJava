import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        int low = lowerLimit;
        int high = upperLimit;
        while (true) {
            int average = average(low, high);
            if (low == high) {
                System.out.println("The number you are thinking of is " + average + ".");
                break;
            }

            if (isGreaterThan(average)) {
                low = average + 1;
                if (high == average) {
                    System.out.println("The number you are thinking of is " + average + ".");
                    break;
                }
            } else high = average;
        }
    }
    // write the guessing logic here

    // implement here the methods isGreaterThan and average

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }

    public boolean isGreaterThan(int number) {
        System.out.println("Is your number greater than " + number + "?");
        String answer = String.valueOf(reader.nextLine());
        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
    }

    public int average(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }
}
