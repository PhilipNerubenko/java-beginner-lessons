package lesson19;

/**
 * A class that demonstrates command line arguments in Java.
 */
public class CommandLineArguments {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    // System.out.println("Hello World!");
    System.out.println("First argument: " + args[0]);
    System.out.println("Number of arguments: " + args.length);
  }
}
