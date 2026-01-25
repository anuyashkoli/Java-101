public class SmartRoom
{
   public static void main(String[] args)
   {
      double temperature = 27; //in Celsius degrees
      double humidity = 0.9; //as a percentage
      boolean smartMode = false;

      /*
      The previous variables have been assigned hidden values here.
      */

      if (smartMode) //if smartMode is true, then...
      {
         if (humidity > 0.7) //if humidity is greater than 0.7 then...
            System.out.println("Dehumidifier activated.");
         else //else, if the humidity is lower, then...
            System.out.println("Smart save mode on. Only fan activated.");
      }
      else //else, if smartMode is false, then...
      {
         if (humidity > 0.7) //if humidity is greater than 0.7 then...
            System.out.println("Dehumidifier activated.");
         else if (temperature > 24) //else, if the humidity is lower, then...
            System.out.println("Fan activated.");
      }
   }
}

// Situation in which the code does work as intended
/// When smart mode is off, humidity is 80% and temperature is 24.

// Situations in which the code does not work as intended ( I don't know how it works, but I will come at this problem tomorrow)
/// When smart mode is on, humidity is 40% and temperature is 20.
/// When smart mode is off, humidity is 70% and temperature is 30.
/// When smart mode is on, humidity is 90% and temperature is 27.
