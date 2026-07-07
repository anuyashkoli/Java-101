package sandbox.TicTacToe;

import java.util.Scanner;

import static sandbox.Arrays.ArrayMastery.divider;

public class Warmup {
    static Scanner ask = new Scanner(System.in);
    static char[][] board = new char[3][3];

    static char state = 'X';

    public static void main (String[] Args) {
        Canvas();
        printBoard();
        gameLoop();
    }

    // Initialise the Board
    public static void Canvas () {
        for (int cellRow = 0; cellRow < board.length; cellRow++ ) {
            System.out.println();
            for (int cellColumn = 0; cellColumn <=board.length - 1; cellColumn ++) {
                board[cellRow][cellColumn] = '-';
            }
        }
    }

    // Reusable method for printing board
    public static void printBoard () {
        for (int cellRow = 0; cellRow < board.length; cellRow++) {
            System.out.println();
            for (int cellColumn = 0; cellColumn < board.length; cellColumn ++) {
                System.out.print("  ");
                System.out.print("[" + board[cellRow][cellColumn] + "]");
            }
        }
    }

    // Handles User Moves; Validates User Moves
    public static void theMove () {
        System.out.println("\n" + state + "'s turn");
        System.out.print("Enter you desired row: ");
        int userRow = ask.nextInt();
        System.out.print("Enter your desired column: ");
        int userColumn = ask.nextInt();

        if (userRow >= board.length || userColumn >= board.length) {  // '>' was crashing the code while entering 3
            System.out.println("Andar hi khelne ka, Bahar nahi jaaneka !!");
            System.out.println("Phir se khel");
            theMove();
        } else {
            if (board[userRow][userColumn] == '-') {
                if (state == 'X') {
                    board[userRow][userColumn] = 'X';
                    state = 'O';
                } else {
                    board[userRow][userColumn] = 'O';
                    state = 'X';
                }
            } else {
                System.out.println("Already Marked with " + board[userRow][userColumn]);
            }
        }
    }

    // Loops the game - Asks for Moves; Prints Board
    public static void gameLoop () {
        for (int rowCell = 0; rowCell < board.length; rowCell++) {
            for (int columnCell = 0; columnCell < board.length; columnCell++) {
                theMove(); // It would run until the iterates to all cells
                printBoard(); // Printing board here will avoid board duplication
            }
        }
    }
}

// TASKs
/*
Task 1 (The Game Loop):
Implement a continuous loop so the game keeps asking for moves.
Players must alternate turns automatically (Player 'X' moves, then Player 'O' moves, then 'X', etc.).

Task 2 (The Bouncer):
Validate the user's input. A player cannot place a piece on a coordinate that is already taken. A player cannot crash the game by entering a number outside the 0-2 range. (Make them try again if they mess up).

Task 3 (The Referee):
After every single move, the program must check if the current player has won. A win is 3 matching characters in a row (horizontally, vertically, or diagonally). If a win is detected, announce the winner and terminate the game loop.

Task 4 (The Draw):
If all 9 spaces are filled and no one has won, announce a "Cat's Game" (Draw) and terminate the loop.
*/