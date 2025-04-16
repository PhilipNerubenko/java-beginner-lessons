package lesson26;

/**
* A class that demonstrates the marathon exception in Java.
*/
public class MarathonExceptionDemo {
 /**
  * A method that throws a TwistYourLegException.
  *
  * @param airTemperature The air temperature.
  * @param runningPace The running pace.
  * @throws TwistYourLegException If the running pace is too fast or the air temperature is too high.
  */
 void marathon(int airTemperature, int runningPace) throws TwistYourLegException {
   if (runningPace > 12) {
     throw new TwistYourLegException("The running pace was too fast: " + runningPace);
   }
   if (airTemperature > 32) {
     throw new CrampedMuscleEWxception();
   }
   System.out.println("The marathon was completed!");
 }

 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   MarathonExceptionDemo t = new MarathonExceptionDemo();
   try {
     t.marathon(20, 13);
   } catch (TwistYourLegException e) {
     System.out.println(e.getMessage());
   } finally {
     System.out.println("In any case, you will receive a certificate");
   }
 }
}

/**
* A class that represents a TwistYourLegException.
*/
class TwistYourLegException extends Exception {
 /**
  * A constructor for the TwistYourLegException class that takes in a message.
  *
  * @param message The message.
  */
 TwistYourLegException(String message) {
   super(message);
 }

 /**
  * A constructor for the TwistYourLegException class.
  */
 TwistYourLegException() {}
}

/**
* A class that represents a CrampedMuscleEWxception.
*/
class CrampedMuscleEWxception extends RuntimeException {
 /**
  * A constructor for the CrampedMuscleEWxception class that takes in a message.
  *
  * @param message The message.
  */
 CrampedMuscleEWxception(String message) {
   super(message);
 }

 /**
  * A constructor for the CrampedMuscleEWxception class.
  */
 CrampedMuscleEWxception() {}
}
