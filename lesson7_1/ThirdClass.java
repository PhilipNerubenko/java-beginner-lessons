package lesson7_1;

/**
* A class that tests the Employee class.
*/
public class ThirdClass {
 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   lesson7.Employee employee = new lesson7.Employee(1000);
   System.out.println("Salary = " + employee.salary);
   employee.salaryIncrease();
 }
}

