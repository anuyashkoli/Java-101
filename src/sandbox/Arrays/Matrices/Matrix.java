package sandbox.Arrays.Matrices;

import static sandbox.Arrays.ArrayMastery.divider;

public class Matrix {

    static int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
    };
    static int arraySize = matrix.length - 1;

    public static void main(String[] Args) {
        thePrinter();
        divider();
        karna();
        divider();
        theHacker();
    }

    public static void thePrinter() {
        System.out.print("\nPrinting 3x3 Matrix");
        for (int forRow = 0; forRow <= arraySize; forRow++) {
            System.out.println();
            for (int forColumn = 0; forColumn <= arraySize; forColumn++) {
                System.out.print(matrix[forRow][forColumn]);
                System.out.print("\t");
            }
        }
    }

    public static void karna() {
        System.out.print("\nPrinting Diagonal Elements and putting 0 everywhere else");
        for (int forRow = 0; forRow <= arraySize; forRow++) {
            System.out.println();
            for (int forColumn = 0; forColumn <= arraySize; forColumn++) {
                System.out.print("\t");
                if (forRow == forColumn) {
                    System.out.print(matrix[forRow][forColumn]);
                } else {
                    System.out.print("0");
                }
            }
        }
    }

    public static void theHacker() {
        int centerRow = matrix.length / 2;
        int centerColumn = matrix[0].length / 2;

        matrix[centerRow][centerColumn] = 99;

        System.out.print("\nUpdated Board ");
        thePrinter();
    }

}

// Tasks
/*
Task 1 (The Printer):
Write a nested for loop (an outer loop for rows, inner loop for columns) to print the entire grid exactly as it looks above, with spaces between the numbers.

Task 2 (The Diagonal):
Write a new loop that goes through the grid but only prints the numbers on the diagonal line from top-left to bottom-right (1, 5, 9).
(Hint: What is the relationship between the row number and the column number for those specific spots?)

Task 3 (The Hacker):
Write code to replace the number 5 in the very center of the grid with the number 99.
Then, call your Task 1 printer loop again to prove the board was updated.*/