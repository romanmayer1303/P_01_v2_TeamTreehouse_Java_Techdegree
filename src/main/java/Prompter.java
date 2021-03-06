import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Input / Output
 */
public class Prompter {

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int promptForGuess() {
        int guess = -1;
        System.out.print("Guess: ");
        try {
            guess = Integer.parseInt(br.readLine().replaceAll("\\s", ""));
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        }
        return guess;
    }

    public void printResult(int counter) {
        if (counter == 1) {
            System.out.printf("%s attempt%n", counter);
        } else {
            System.out.printf("%s attempts%n", counter);
        }
    }

    public String askForItemName() {
        try {
            System.out.println("What type of item?");
            String itemName = br.readLine().replaceAll("\\s", "");
            return itemName;
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return null;
    }

    public int askForMaxNumberOfItems(String itemName) {
        int maxNumberOfItems = -5;
        try {
            System.out.printf("What is the maximum amount of %s?%n", itemName);
            maxNumberOfItems = Integer.parseInt(br.readLine().replaceAll("\\s", ""));
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return maxNumberOfItems;
    }

    public void promptToStartTheGame(String itemName, int maxNumberOfItems) {
        System.out.printf("How many %s are in the jar?%n", itemName);
        if (maxNumberOfItems > 1) {
            System.out.printf("Pick a number between 1 and %s.%n", maxNumberOfItems);
        }
    }

    public void outOfRange(int maxNumberOfItems) {
        System.out.printf("Your guess must be between 1 and %s.%n", maxNumberOfItems);
    }

    public void guessIsTooLow() {
        System.out.println("Your guess is too low.");
    }

    public void guessIsTooHigh() {
        System.out.println("Your guess is too high.");
    }
}

