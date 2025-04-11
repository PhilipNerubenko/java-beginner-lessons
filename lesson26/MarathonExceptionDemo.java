package lesson26;

public class MarathonExceptionDemo {
  void marathon(int airTemperature, int runningPace) throws TwistYourLegException {
    if (runningPace > 12) {
      throw new TwistYourLegException("The running pace was too fast: " + runningPace);
    }
    if (airTemperature > 32) {
      throw new CrampedMuscleEWxception();
    }
    System.out.println("The marathon was completed!");
  }

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

class TwistYourLegException extends Exception {
  TwistYourLegException(String message) {
    super(message);
  }
  TwistYourLegException() {}
}

class CrampedMuscleEWxception extends RuntimeException {
  CrampedMuscleEWxception(String message) {
    super(message);
  }
  CrampedMuscleEWxception() {}
}