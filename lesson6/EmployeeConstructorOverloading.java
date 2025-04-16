package lesson6;

/**
* A class that represents an employee.
*/
public class EmployeeConstructorOverloading {
 /**
  * The unique identifier for the employee.
  */
 int id;

 /**
  * The surname of the employee.
  */
 String surname;

 /**
  * The age of the employee.
  */
 int age;

 /**
  * The salary of the employee.
  */
 double salary;

 /**
  * The department of the employee.
  */
 String Department;

 /**
  * The default constructor for the EmployeeConstructorOverloading class.
  */
 public EmployeeConstructorOverloading() {}

 /**
  * A constructor for the EmployeeConstructorOverloading class that takes in the id, surname, and age.
  *
  * @param id The unique identifier for the employee.
  * @param surname The surname of the employee.
  * @param age The age of the employee.
  */
 public EmployeeConstructorOverloading(int id, String surname, int age) {
   this(id, surname, age, 0.0, null);
 }

 /**
  * A constructor for the EmployeeConstructorOverloading class that takes in the surname and age.
  *
  * @param surname The surname of the employee.
  * @param age The age of the employee.
  */
 public EmployeeConstructorOverloading(String surname, int age) {
   this(0, surname, age, 0.0, null);
 }

 /**
  * A constructor for the EmployeeConstructorOverloading class that takes in the id, surname, age, salary,
  * and department.
  *
  * @param id The unique identifier for the employee.
  * @param surname The surname of the employee.
  * @param age The age of the employee.
  * @param salary The salary of the employee.
  * @param Department The department of the employee.
  */
 public EmployeeConstructorOverloading(
     int id, String surname, int age, double salary, String Department) {
   this.id = id;
   this.surname = surname;
   this.age = age;
   this.salary = salary;
   this.Department = Department;
 }
}


/**
* A class that tests the EmployeeConstructorOverloading class.
*/
class EmployeeTest {
 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
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
