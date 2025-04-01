package lesson11;

public class ArgumentsMethodEmployee {
  public String name;
  public double salary;

  ArgumentsMethodEmployee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public double doubling(double a) {
    a = a * 2;
    return a;
  }

  public double changeSalary() {
    return salary *= 2;
  }
}

class ArgumentsMethodEmployeeTest {
  public static void main(String[] args) {
    ArgumentsMethodEmployee employee1 = new ArgumentsMethodEmployee("Max", 500);
    System.out.println("Salary = " + employee1.salary);
    double result = employee1.doubling(employee1.salary);
    System.out.println("Value a, not salary = " + result);
    System.out.println("Salary = " + employee1.salary);
    employee1.changeSalary();
    System.out.println("Salary(change salary) = " + employee1.salary);
  }
}