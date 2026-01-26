package sandbox;

public class HundredthPrime
{
   public static void main(String[] args)
   {
      int currentNumber = 2;
      int maxNumber = 100;

      while (currentNumber <= maxNumber) {
         for (int divisor = 2; divisor <= currentNumber; divisor++) {
            if (divisor == currentNumber) {
               System.out.println(currentNumber + " is a Prime Number");
               break;
            }
            else if (currentNumber % divisor == 0) {
               System.out.println(currentNumber + " is a Composite Number");
               break;
            }
         }
         currentNumber++;
      }
   }
}

/*
I haven't yet got the logic behind it, but the fact that I recreate the code by just looking at the syntax is quite delightful
I'll come back to this program later on and would rewrite this !!!

1) I had not used while loop before peeking in the previous implementation
2) I was doing something with the top level variables and for loop, trying to iterate both divisor and currentNumber parallelly
3) I have good grasp of if conditionals and for loop, but I have to practise them together and with more complexity
4) while Loop would take a while
 */