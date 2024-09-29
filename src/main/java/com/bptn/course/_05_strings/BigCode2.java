import java.util.Scanner;
public class StringOperations {
    public static void main(String[] args) {
        //Creation of scanner object to read input from user
        Scanner scan = new Scanner(System.in);

        //Variable to old user choice
        int choice;

    do {
      System.out.println("Press 1 for Palindrome Check");
      System.out.println("Press 2 to reverse a String");
      System.out.println("Press 3 to Concatenate two Strings");
      System.out.println("Press 4 for String Comparison");
      System.out.println("Press 5 to Calculate the Length of String");
      System.out.println("Enter the option: ");
      choice = scan.nextInt();
      scan.nextLine();
      switch (choice) {
        case 1: // Palindrome Check
          System.out.println("Palindrome Check");
          System.out.println("Enter a string: ");
          String palindromeInput = scan.nextLine();
          String reversedInput = "";
          for (int i = palindromeInput.length() - 1; i >= 0; i--) {
            reversedInput += palindromeInput.charAt(i); // Append each character in reverse order
          }
          if (palindromeInput.equals(reversedInput)) {
            System.out.println(palindromeInput + " is a palindrome.");
          } else {
            System.out.println(palindromeInput + " is not a palindrome.");
          }
          break; // Exit this case
        case 2: // Reverse a String
          System.out.println("Reverse a String");
          System.out.println("Enter a string: ");
          String reverseInput = scan.nextLine();
          String reversed = "";
          for (int i = reverseInput.length() - 1; i >= 0; i--) {
            reversed += reverseInput.charAt(i); // Append each character in reverse order
          }
          System.out.println("Reversed string: " + reversed); // Print the reversed string
          break;
        case 3: // Concatenate two Strings
          System.out.println("Concatenate two Strings");
          System.out.println("Enter First string: ");
          String firstString = scan.nextLine();
          System.out.println("Enter Second String: ");
          String secondString = scan.nextLine();
          String concatenated = firstString + secondString; // Concatenate strings
          System.out.println("Concatenated string: " + concatenated); // Print concatenated string
          break;
        case 4: // String Comparison
          System.out.println("String Comparison");
          System.out.println("Enter First string: ");
          String comparisonInput1 = scan.nextLine();
          System.out.println("Enter Second string: ");
          String comparisonInput2 = scan.nextLine();
          if (comparisonInput1.equals(comparisonInput2)) {
            System.out.println("The entered strings are equal.");
          } else {
            System.out.println("The entered strings are not equal.");
          }
          break;
        case 5: // Calculate the Length of String
          System.out.println("Calculate the Length of String");
          System.out.println("Enter a string: ");
          String lengthInput = scan.nextLine();
          System.out.println("The length of the entered string is: " + lengthInput.length()); // Print length
          break;
        default: // Handle invalid choice
          System.out.println("Invalid choice! Please make a valid choice.");
      }
    } while (choice >= 1 && choice <= 5); // Repeat until a valid choice is made
    scan.close(); // Close the scanner
            
        
        

    }
}