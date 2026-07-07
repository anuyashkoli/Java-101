package sandbox.TicTacToe;

import java.util.Scanner;

import static sandbox.Arrays.ArrayMastery.divider;

public class Warmup {
    static Scanner ask = new Scanner(System.in);
    static char[][] board = new char[3][3];

    public static void main (String[] Args) {
        Canvas();
        printBoard();
        theMove();
    }

    public static void Canvas () {
        for (int cellRow = 0; cellRow < board.length; cellRow++ ) {
            System.out.println();
            for (int cellColumn = 0; cellColumn <=board.length - 1; cellColumn ++) {
                board[cellRow][cellColumn] = '-';
            }
        }
    }

    public static void printBoard () {
        divider();
        for (int cellRow = 0; cellRow < board.length; cellRow++) {
            System.out.println();
            for (int cellColumn = 0; cellColumn < board.length; cellColumn ++) {
                System.out.print("  ");
                System.out.print("[" + board[cellRow][cellColumn] + "]");
            }
        }
    }

    public static void theMove () {
        divider();
        System.out.print("Enter you desired row: ");
        int userRow = ask.nextInt();
        System.out.print("\nEnter your desired column: ");
        int userColumn = ask.nextInt();
        board[userRow][userColumn] = 'X';
        printBoard();
    }
}

// TASKs
/*
Task 1 (The Canvas):
Initialize a 3x3 grid and fill every empty coordinate with a dash ('-').

Task 2 (The Printer):
Create a reusable method named printBoard() that prints the current state of your grid to the console in a visually clean 3x3 format.

Task 3 (The First Move):
Prompt the user to enter a row and a column.
Place an 'X' at that exact coordinate on the board, and reprint the board to prove the move was successful.
*/