import java.util.Scanner;

public class WordEncryption {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
                // Create scanner to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for input
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        //initialize StringBuilder to build a new string
        StringBuilder encryptedWord = new StringBuilder();
        
        // Loop through each character in the word to process it
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            
            // Shift the character by one and wrap for lowercase
            if (c >= 'a' && c <= 'z') {
                encryptedWord.append((char)((c - 'a' + 1) % 26 + 'a'));
            }
            // Shift the character by one and wrap for uppercase
            else if (c >= 'A' && c <= 'Z') {
                encryptedWord.append((char)((c - 'A' + 1) % 26 + 'A'));
            }
            // If the character is not a letter, leave it unchanged
            else {
                encryptedWord.append(c);
            }
        }
        
        
        // Display the encrypted word as a string
        System.out.println("Encrypted word: " + encryptedWord.toString());

        // Close the scanner
        scanner.close();
    }
}
        
