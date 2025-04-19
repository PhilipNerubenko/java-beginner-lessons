package lesson7;

/**
 * A class that represents an employee.
 */
public class Employee {
  /**
   * The salary of the employee.
   */
  public double salary;

  /**
   * A constructor for the Employee class that takes in the salary.
   *
   * @param salary The salary of the employee.
   */
  public Employee(double salary) {
    this.salary = salary;
  }

  /**
   * A method that increases the salary of the employee.
   */
  public void salaryIncrease() {
    // access only in this method, local variable, not access modifier
    double result = salary * 2;
    System.out.println("New salary = " + result);
  }

  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    Employee employee = new Employee(1000);
    System.out.println("Salary: " + employee.salary);
    employee.salaryIncrease();
  }
}

/**
 * A class that tests the Employee class.
 */
class EmployeeTest {
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
