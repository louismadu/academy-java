package com.bptn.course._05_strings;

public class BigCode {

	public static void main(String[] args) {
		Spring word = (a - z);

		
		StringBuilder encrypted = new StringBuilder();
		// Iterate through each character in the word
		for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                // Shift character
                char shiftedChar;
                if (ch == 'z') {
                    shiftedChar = 'a'; // Wrap from z to a
                } else if (ch == 'Z') {
                    shiftedChar = 'A'; // Wrap from Z to A
                } else {
                    shiftedChar = (char) (ch + 1); // Shift to next character
                }
                encrypted.append(shiftedChar);
            } else {
                // Non-letter characters remain unchanged
                encrypted.append(ch);
            }
        }
        return encrypted.toString();            	
            }

		

	}

}
