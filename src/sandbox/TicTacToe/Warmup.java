package sandbox.TicTacToe;

import java.util.Scanner;

import static sandbox.Arrays.ArrayMastery.divider;

public class Warmup {
    static Scanner ask = new Scanner(System.in);
    static char[][] board = new char[3][3];

    static char state = 'X';
    static boolean gameOn = true;

    public static void main(String[] Args) {
        Canvas();
        printBoard();
        gameLoop();
    }

    // Initialise the Board
    public static void Canvas() {
        for (int cellRow = 0; cellRow < board.length; cellRow++) {
            System.out.println();
            for (int cellColumn = 0; cellColumn <= board.length - 1; cellColumn++) {
                board[cellRow][cellColumn] = '-';
            }
        }
    }

    // Reusable method for printing board
    public static void printBoard() {
        for (int cellRow = 0; cellRow < board.length; cellRow++) {
            System.out.println();
            for (int cellColumn = 0; cellColumn < board.length; cellColumn++) {
                System.out.print("  ");
                System.out.print("[" + board[cellRow][cellColumn] + "]");
            }
        }
    }

    // Handles User Moves; Validates User Moves
    public static void theMove() {
        System.out.println("\n" + state + "'s turn");
        System.out.print("Enter you desired row: ");
        int userRow = ask.nextInt();
        System.out.print("Enter your desired column: ");
        int userColumn = ask.nextInt();

        if (userRow < 0 || userRow >= board.length || userColumn < 0 || userColumn >= board.length) {  // Checking out of bound user input
            System.out.println("Andar hi khelne ka, Bahar nahi jaaneka !!");
            System.out.println("Phir se khel");
        } else {
            if (board[userRow][userColumn] == '-') {  // Checks if the cell is blank / unmarked
                if (state == 'X') {
                    board[userRow][userColumn] = 'X';
                    callTheReferee();
                    state = 'O';
                } else {
                    board[userRow][userColumn] = 'O';
                    callTheReferee();
                    state = 'X';
                }
            } else {
                System.out.println("Already Marked with " + board[userRow][userColumn]);
            }
        }
    }

    public static void callTheReferee() {
        //Horizontally
        if (board[0][0] != '-' && board[0][0] == board[0][1] && board[0][1] == board[0][2]) {
            System.out.println(state + " won");
            gameOn = false;
        } else if (board[1][0] != '-' && board[1][0] == board[1][1] && board[1][1] == board[1][2]) {
            System.out.println(state + " won");
            gameOn = false;
        } else if (board[2][0] != '-' && board[2][0] == board[2][1] && board[2][1] == board[2][2]) {
            System.out.println(state + " won");
            gameOn = false;
        }

        //Vertically
        if (board[0][0] != '-' && board[0][0] == board[1][0] && board[1][0] == board[2][0]) {
            System.out.println(state + " won");
            gameOn = false;
        } else if (board[0][1] != '-' && board[0][1] == board[1][1] && board[1][1] == board[2][1]) {
            System.out.println(state + " won");
            gameOn = false;
        } else if (board[0][2] != '-' && board[0][2] == board[1][2] && board[1][2] == board[2][2]) {
            System.out.println(state + " won");
            gameOn = false;
        }

        //Diagonal
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            System.out.println(state + " won");
            gameOn = false;
        } else if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[1][0]) {
            System.out.println(state + " won");
            gameOn = false;
        }
    }

    // Loops the game - Asks for Moves; Prints Board
    public static void gameLoop() {
        while (gameOn) {
            theMove(); // It would run until the game is over
            printBoard(); // Printing board here will avoid board duplication
        }

    }
}

// TASKs
/*
Task 1: Fix the Bouncer’s Math (The "<" vs ">" Trap)
Look at your out-of-bounds if statement. You wrote userRow > 0.
Think about that logically: If a user types 1 (a perfectly valid row), 1 > 0 is true. The bouncer triggers and kicks them out! Your game currently only accepts 0 or negative numbers.
The Fix: You need to check for negative numbers. Change the directional sign so it checks if the input is less than zero.

Task 2: Cure the Referee’s Hallucination (The Fake Win)
Your game immediately printed "X won" because your second Diagonal check triggered on an empty board. Look closely at that specific else if line.
Error A: You checked if the cell == '-' instead of != '-'. You accidentally told the referee that a line of dashes is a winning move.
Error B: Look at the coordinates you used for that second diagonal: [0][2], [1][1], and [1][0]. Draw those coordinates on a piece of paper. That makes a crooked "L" shape, not a diagonal line. You missed the bottom-left corner.
The Fix: Correct the != symbol and fix the final coordinate.

Task 3: Build the Clock (The Draw Condition)
You skipped Task 4. Right now, if nobody gets 3-in-a-row, the game will loop forever because gameOn never becomes false.
The Fix: Create an int variable to count successful turns. Every time an 'X' or 'O' is successfully placed, add 1 to it. When that counter hits 9, print "Draw" and shut down the loop.
*/