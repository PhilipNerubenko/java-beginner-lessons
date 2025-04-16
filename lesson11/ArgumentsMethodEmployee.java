package lesson11;

/**
* A class that represents an employee.
*/
public class ArgumentsMethodEmployee {
 /**
  * The name of the employee.
  */
 public String name;

 /**
  * The salary of the employee.
  */
 public double salary;

 /**
  * A constructor for the ArgumentsMethodEmployee class that takes in the name and salary.
  *
  * @param name The name of the employee.
  * @param salary The salary of the employee.
  */
 ArgumentsMethodEmployee(String name, double salary) {
   this.name = name;
   this.salary = salary;
 }

 /**
  * A method that doubles the value of a.
  *
  * @param a The value to be doubled.
  * @return The doubled value of a.
  */
 public double doubling(double a) {
   a = a * 2;
   return a;
 }

 /**
  * A method that doubles the salary of the employee.
  *
  * @return The doubled salary of the employee.
  */
 public double changeSalary() {
   return salary *= 2;
 }
}


/**
* A class that tests the ArgumentsMethodEmployee class.
*/
class ArgumentsMethodEmployeeTest {
 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
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
