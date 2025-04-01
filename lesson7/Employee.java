package lesson7;

public class Employee {
  // public = access anywhere
  public double salary;

  // private = access only current class
  // private double salary;

  // default = access only current package
  // double salary;

  // protected = default + children of the class
  // protected double salary;

  public Employee(double salary) {
    this.salary = salary;
  }

  public void salaryIncrease() {
    // access only in this method, local variable, not access modifier
    double result = salary * 2;
    System.out.println("New salary = " + result);
  }

  public static void main(String[] args) {
    Employee employee = new Employee(1000);
    System.out.println("Salary: " + employee.salary);
    employee.salaryIncrease();
  }
}

class EmployeeTest {
  public static void main(String[] args) {
    Employee employee = new Employee(1000);
    System.out.println("Salary = " + employee.salary);
    employee.salaryIncrease();
  }
}