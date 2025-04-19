package lesson7;

/**
 * A class that demonstrates the use of classes from different packages.
 */
public class A {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    @SuppressWarnings("unused") B object = new B();
    // package full name for call class
    @SuppressWarnings("unused")
    lesson6.EmployeeConstructorOverloading emp =
        new lesson6.EmployeeConstructorOverloading("Ivanov", 21);
  }
}
