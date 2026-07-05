package sandbox.Arrays;

public class ArrayMastery {
    public static void main(String Args[]) {
        theSearcher();
    }

    public static int[] numbers = {15, 22, 8, 42, 17, 9, 33, 50, 4, 11};

    public static void theSearcher() {
        System.out.println("Array Elements Greater than 20: ");
        for (int searcher = 0; searcher < numbers.length; searcher++) {
            if (numbers[searcher] > 20) {
                System.out.println(numbers[searcher]);
            }
        }
    }
}


// Phase 3: Arrays (Multiple Data Points)
/*
Task 1 (The Searcher): Write a for loop that goes through the numbers array provided above and prints only the numbers that are greater than 20.

Task 2 (The Heavyweight): Write a loop to find the largest single number in that array. (Hint: Create a variable int max = 0; before the loop. As you loop through the array, if the current item is bigger than max, update max to be that new item).

Task 3 (The Reverser): Write a loop that prints the array backwards (starting from 11 and ending at 15).*/

