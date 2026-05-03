package sandbox;

public class OddSelector {
    public static void main(String[] args) {
        System.out.println("These are the odd numbers from 1 to 100.");
        System.out.println("Ready?");
        // for values from 1 to 100
        for (int value = 1; value <= 100; value++) {
            if (value % 2 != 0) {
                System.out.println(value);
            }
        }
        System.out.println("That was fast!");
    }
}

/*
Modifying the variable updater statement in the loop :
 for (int value = 1; value <= 100; value += 2) value += 2
*/

/*
Putting a conditional inside the loop
  if (value % 2 != 0)
*/