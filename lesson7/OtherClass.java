package lesson7;

public class OtherClass {
  public static void main(String[] args) {
    Employee employee = new Employee(1000);
    System.out.println("Salary = " + employee.salary);
    employee.salaryIncrease();
  }
}
