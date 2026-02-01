package sandbox;

public class HundredthPrime {
   public static void main(String[] args) {
      int counter = 0;
      int currentNumber = 2;

      while (counter <= 99) {
         for (int divisor = 2; divisor <= currentNumber; divisor++) {
            if (currentNumber == divisor) {
               counter++;
            }
            if (currentNumber % divisor == 0) {
               break;
            }
         }
         currentNumber++;
      }
      System.out.println("\nThe Hundredth Prime Number is: " + (currentNumber - 1));
   }
}

/*
01-02-2026 - 21:13
I have successfully written the program again, but it's mostly from memory, but writing it helps connect the logical dots
while writing this, I saw that I had previously used 99 as limit for counter; I haven't got the logic of using 99 and 100 and it's impact to the output

 */


/*
Not going ahead without solving this:
Let's Keep a log:
27-01-2026 - 12:45

27-01-2026 - 19:28


Solved:
[28/01/2026] - 00:24
I think I have done it, but with a hint, an intrinsic hint

Hint:
You are painfully close. You have built the engine, but you haven't put it in "Drive" yet, and your Bouncer is a little too thorough.
I've zeroed in on the core issue: the infinite loop. My code analysis pinpointed that currentNumber isn't incrementing, so it's stuck at 2. This causes an endless prime check.

*/

/*
I haven't yet got the logic behind it, but the fact that I recreate the code by just looking at the syntax is quite delightful
I'll come back to this program later on and would rewrite this !!!

1) I had not used while loop before peeking in the previous implementation
2) I was doing something with the top level variables and for loop, trying to iterate both divisor and currentNumber parallelly
3) I have good grasp of if conditionals and for loop, but I have to practise them together and with more complexity
4) while Loop would take a while
 */