import java.util.Scanner;
public class PluralForm {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
/// Request for user input
        System.out.print("# in: ");
        int amnt = scanner.nextInt(); // Read the amount
        scanner.nextLine();
        System.out.print("word: ");
        String word = scanner.nextLine(); // Read the word
        String pluralWord; // Variable for the plural form
        // Determine the plural form based on the amount
        if (amnt != 1) {
            char lastChar = word.charAt(word.length() - 1); // Last character
            char secondLastChar = word.length() > 1 ? word.charAt(word.length() - 2) : ' '; // Second last character
            // Check specific endings for pluralization
            if (lastChar == 'e' && secondLastChar == 'f') {
                pluralWord = word.substring(0, word.length() - 2) + "ves"; // Change "fe" to "ves"
            } else if (lastChar == 's' && secondLastChar == 'u') {
                pluralWord = word.substring(0, word.length() - 2) + "i"; // Change "us" to "i"
            } else if (lastChar == 'y' && !(secondLastChar == 'a' || secondLastChar == 'o' || secondLastChar == 'e' || secondLastChar == 'u')) {
                pluralWord = word.substring(0, word.length() - 1) + "ies"; // Change "y" to "ies"
            } else if (lastChar == 'h' && (secondLastChar == 'c' || secondLastChar == 's')) {
                pluralWord = word + "es"; // Add "es" for "ch" and "sh"
            } else {
                pluralWord = word + "s"; // Just add "s" for regular nouns
            }
        } else {
            pluralWord = word; // Keep the word as is for singular
        }
        // Print the result
        System.out.println(amnt + " " + pluralWord); // Display the result
        scanner.close(); // Close the scanner
    }
}