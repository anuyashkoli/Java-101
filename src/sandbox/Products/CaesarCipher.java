package sandbox.Products;

import java.util.Scanner;

public class CaesarCipher {

    static char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    static int startEnd = 0;
    static int lastEnd = alphabets.length - 1;
    static String plaintext;
    static String ciphertext = "";
    static int cipherKey;
    static Scanner ask = new Scanner(System.in);

    public static void main(String[] Args) {
        thePrinter();
        encrypt();
    }

    public static void thePrinter () {
        for (int mapper = 0; mapper < alphabets.length; mapper++) {
            // Printing Alphabets
            System.out.print("[" + alphabets[mapper] + "-" + mapper + "]");
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void encrypt() {
        System.out.println("\nCaesar's Cipher");
        System.out.print("Enter your plaintext: ");
        plaintext = ask.nextLine();
        plaintext = plaintext.toUpperCase();

        System.out.print("Enter your Key: ");
        cipherKey = ask.nextInt();

        // Mapping plaintext letter to alphabets
        for (int letter = 0; letter < plaintext.length(); letter++ ) {
            for (int mapper = 0; mapper < alphabets.length; mapper++) {
                if (plaintext.charAt(letter) == alphabets[mapper]) {
                    ciphertext = ciphertext + alphabets[mapper + cipherKey];
                }
            }
        }
        System.out.println("Plaintext: " + plaintext);
        System.out.println("Ciphertext: " + ciphertext);
    }
}

// The Brief: Build a cryptography tool used by the Roman Empire.
/* Criteria:
The user enters a secret message (e.g., "ATTACK").
The program shifts every letter forward by 3 places in the alphabet and prints the encrypted code (e.g., "DWWDFN").
It also needs a decryption mode to turn "DWWDFN" back into "ATTACK".*/

/* Like to know, how this works !!
        char[] alphabets = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabets[i] = (char) ('A' + i);
        }
*/