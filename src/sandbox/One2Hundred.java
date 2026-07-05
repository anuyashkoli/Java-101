package sandbox;

public class One2Hundred {
    static void main() {
        tillHundred();
        tillOne();
        EvenOut();
        GaussTheBoss();
    }

    public static void tillHundred() {
        System.out.print("1 to 100: ");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ", ");
        }
    }

    static void tillOne() {
        System.out.print("\n\n100 to 1: ");
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + ", ");
        }
    }

    public static void EvenOut() {
        System.out.println("\n\nEven Numbers");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }

            if (i > 50) { // I could have just limit the for loop itself, but chal na !!!!
                break;
            }
        }
    }

    public static void GaussTheBoss() {
        int sum = 0;
        System.out.println("\n\n ");
        for (int i = 0; i <= 100; i++) {
            if (i == 100) {
                System.out.print(i);
            } else {
                System.out.print(i + " + ");
            }
            sum = sum + i;
        }
        System.out.print(" = " + sum);
    }

}

// Assignment 01
/*
Print 1 to 100.
Print 100 down to 1.
Print only the even numbers between 1 and 50.
Calculate the sum of all numbers from 1 to 100 (needs a tracking variable outside the loop).
 */