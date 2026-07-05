package sandbox;

public class Grid {
    public static void main(String[] args) {
        square();
        triangle();
        table();
    }

    public static void square() {
        System.out.println("\nStar Grid");
        int gridSize = 20;
        for (int column = 1; column <= gridSize; column++) {
            for (int row = 1; row <= gridSize; row++) {
                System.out.print("⭐");
            }
            System.out.println();
        }
    }

    public static void triangle() {
        System.out.println("\nRight-angled Triangle");
        for (int iterator = 1; iterator <= 5; iterator++) {
            for (int liner = 1; liner <= iterator; liner++) {
                System.out.print("⭐");
            }
            System.out.println();
        }
    }

    public static void table() {
        System.out.println("\n\nMultiplication Table: 1 to 10");
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            for (int multiplicand = 1; multiplicand <= 10; multiplicand++) {
                System.out.print("\t" + multiplier * multiplicand + "\t");
            }
            System.out.println();
        }
    }
}

// Phase One: Nested Loop
/*
Task 1 (The Grid): Print a 5x5 grid of stars (*).
Task 2 (The Triangle): Print a right-angled triangle of stars (Line 1 has one star, Line 5 has five stars).
Task 3 (The Multiplication Table): Print the multiplication tables for numbers 1 through 10. The output should look like a grid.
 */
