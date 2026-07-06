package sandbox.Strings;

import java.util.Scanner;

public class StringMastery {

    // Variables
    static Scanner ask = new Scanner(System.in);

    // Main Method
    public static void main(String[] Args) {
        verticalSpeller();
        vowelHunter();
        palindromeBoss();
    }

    // The Vertical Speller Method - Takes String and prints letters; Vertically
    public static void verticalSpeller() {
        System.out.println("Enter a single word: ");
        String singleWord = ask.nextLine();
        for (int letter = 0; letter < singleWord.length(); letter++) {
            System.out.println(singleWord.charAt(letter));
        }
    }

    public static void vowelHunter() {
        System.out.println("Enter a sentence: ");
        String sentence = ask.nextLine();
        sentence = sentence.toLowerCase();
        int vowelCounter = 0;
        for (int letter = 0; letter < sentence.length(); letter++) {
            char currentLetter = sentence.charAt(letter);
            if (currentLetter == 'a' || currentLetter == 'e' || currentLetter == 'i' || currentLetter == 'o' || currentLetter == 'u') {
                vowelCounter++;
            }
        }
        System.out.println("There are : " + vowelCounter + " vowels");
    }

    public static void palindromeBoss() {
        String reverseWord = "";
        System.out.println("Enter your word to check: ");
        String word = ask.nextLine();

        for (int letter = word.length() - 1; letter >= 0; letter --) {
            char currentLetter = word.charAt(letter);
            reverseWord = reverseWord + currentLetter;
        }

        if (word.equals(reverseWord)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }


}

// TASKs
/*
Task 1 (The Vertical Speller):
Ask the user to enter a single word.
Write a for loop that goes from 0 to the length of the string, and prints each character on its own line using .charAt().

Task 2 (The Vowel Hunter):
Ask the user to enter a sentence.
Write a loop to check every single letter. If the letter is an 'a', 'e', 'i', 'o', or 'u', add +1 to a counter.
Print the final vowel count at the end. (Hint: You will need a massive if statement with a lot of || (OR) operators, or a switch statement).

Task 3 (The Palindrome Boss):
A palindrome is a word that is spelled the same forwards and backwards (e.g., "racecar", "madam").
Ask the user for a word. Write the logic to check if the word is a palindrome. Print "It's a palindrome!" or "Not a palindrome."
*/