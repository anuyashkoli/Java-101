public class BooleanOperators
{
   public static void main(String[] args)
   {
      boolean trueStatement = true, falseStatement = false;

      // Not true is
      System.out.println("NOT true is (!): " + !trueStatement);

      // true AND false is
      System.out.println("true AND false is: (&&) " + (trueStatement && falseStatement)); // true AND false = false

      // true OR false is
      System.out.println("true OR false is: (||) " + (trueStatement || falseStatement) ); //true OR false = true

      // Not (True and not false) is
      System.out.println("NOT(true AND NOT false) is: !( && !) " + (!(trueStatement && !falseStatement)));
   }
}