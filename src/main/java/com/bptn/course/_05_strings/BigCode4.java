import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        //Define the integers
        int targetNumber = 23;
        int guess = 0;
        boolean continueGame = true;

        //Creation of scanner object to read input from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome what is your Guess ?");

        //While loop to keep the game running until the user guesses correctly
        while (continueGame) {
            System.out.print("Enter your guess (between 1 and 100):");

            // Read user input
            guess = scan.nextInt();

            //Check if the guess is within the valid range 
            if(guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if ( guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number correctly!");
                continueGame = false; // End the game
            }
        }
         //Close the scanner   
        scan.close(); 

    }
}