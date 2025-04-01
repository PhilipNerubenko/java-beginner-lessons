package lesson7_1;

public class ThirdClass {
  public static void main(String[] args) {
    lesson7.Employee employee = new lesson7.Employee(1000);
    System.out.println("Salary = " + employee.salary);
    employee.salaryIncrease();
  }
}
