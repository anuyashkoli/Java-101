package sandbox;

public class HundredthPrime {
   public static void main(String[] args) {
      /* Make a code that displays the 100th prime number */

      int startNumber = 2;
      int maxNumber = 1;


      System.out.println("From `while` loop:");
      while (maxNumber <= 10) {

         System.out.println(startNumber + " x " + maxNumber + " = " + startNumber * maxNumber);
         maxNumber++;
      }

      System.out.println("From `for` loop:");
      for (int multiplier = 1; multiplier <= 10; multiplier++) {

         System.out.println(multiplier);
      }

   }


}

/*
Not going ahead without solving this:
Let's Keep a log:
27-01-2026 - 12:45
 */

/*
I haven't yet got the logic behind it, but the fact that I recreate the code by just looking at the syntax is quite delightful
I'll come back to this program later on and would rewrite this !!!

1) I had not used while loop before peeking in the previous implementation
2) I was doing something with the top level variables and for loop, trying to iterate both divisor and currentNumber parallelly
3) I have good grasp of if conditionals and for loop, but I have to practise them together and with more complexity
4) while Loop would take a while
 */

/*
Incorrect ❌
Expected: 541
Actual:
2 is a Prime Number
3 is a Prime Number
4 is a Composite Number
.
97 is a Prime Number
98 is a Composite Number
99 is a Composite Number
100 is a Composite Number

 */