package lesson7;

/**
 * A class that tests the Employee class.
 */
public class OtherClass {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    Employee employee = new Employee(1000);
    System.out.println("Salary = " + employee.salary);
    employee.salaryIncrease();
  }
}
