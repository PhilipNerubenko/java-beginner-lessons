package lesson6;

public class EmployeeConstructorOverloading {
  int id;
  String surname;
  int age;
  double salary;
  String Department;

  public EmployeeConstructorOverloading() {}

  public EmployeeConstructorOverloading(int id, String surname, int age) {
    this(id, surname, age, 0.0, null);
  }

  public EmployeeConstructorOverloading(String surname, int age) {
    this(0, surname, age, 0.0, null);
  }

  public EmployeeConstructorOverloading(
      int id, String surname, int age, double salary, String Department) {
    this.id = id;
    this.surname = surname;
    this.age = age;
    this.salary = salary;
    this.Department = Department;
  }
}

class EmployeeTest {
  public static void main(String[] args) {
    EmployeeConstructorOverloading employee = new EmployeeConstructorOverloading(1, "Ivanov", 25);
    System.out.println(employee.surname);
    EmployeeConstructorOverloading employee1 = new EmployeeConstructorOverloading("Petrov", 25);
    System.out.println(employee1.surname);
    EmployeeConstructorOverloading employee2 =
        new EmployeeConstructorOverloading(2, "Sidorov", 25, 100000.0, "QA");
    System.out.println(employee2.Department);
  }
}