## Question 5.2

import java.util.Random;
import java.util.Scanner;

public class perusall {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
        
        int chosenNumber = random.nextInt(10) + 1;
        int maxAttempts = 4;
        int attempts = 0;
        
    System.out.println("Hi!");

        while (attempts < maxAttempts) {
        System.out.print("Enter your guess: ");
        int userGuess = scanner.nextInt();
        
        int difference = Math.abs(chosenNumber - userGuess);
        
        if (difference == 0) {
        System.out.println("You guessed the correct number!");
        break;
        } else {
        System.out.println("That's not correct.");
        
        if (userGuess > chosenNumber) {
        System.out.println("Your guess is too high");
        } else {
        System.out.println("Your guess is too low");
        }
        
        attempts++;
        System.out.println("Attempts left: " + (maxAttempts - attempts));
        }
        }
        
        if (attempts == maxAttempts) {
        System.out.println("No more shots. The correct number was: " + chosenNumber);
        }
        
        scanner.close();
}

}
