package lesson24;

/**
* A class that demonstrates polymorphism and casting in Java.
*/
public class PolymorphismCastingDemo {
 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   // up cast - converting from one class type to another type
   EmployeePolymorphism employee = new TeacherPolymorphism();
   EmployeePolymorphism employee1 = new DriverPolymorphism();
   EmployeePolymorphism employee2 = new DoctorPolymorphism();

   // down cast - converting from one class type to another type
   // DoctorPolymorphism doctorCasting = (DoctorPolymorphism) employee2;
   System.out.println(((DoctorPolymorphism) employee2).speciality);

   HelpAble2 helpAble = new DoctorPolymorphism();
   // down casting
   System.out.println(((DoctorPolymorphism) helpAble).speciality);

   EmployeePolymorphism[] employees = {employee, employee1, employee2};

   // for (EmployeePolymorphism emp: employees){
   //     emp.work();
   // }

   // instanceof - checks whether an object is a class that implements a given interface
   System.out.println(employee instanceof TeacherPolymorphism);
   System.out.println(employee instanceof DriverPolymorphism);
 }
}

/**
* An abstract class that represents an employee.
*/
abstract class EmployeePolymorphism implements HelpAble2 {
 /**
  * A method that prints "Employee: I'm sleeping".
  */
 void sleep() {
   System.out.println("Employee: I'm sleeping");
 }

 /**
  * An abstract method that works.
  */
 abstract void work();
}

/**
* A class that represents a teacher.
*/
class TeacherPolymorphism extends EmployeePolymorphism implements HelpAble2 {
 /**
  * A method that prints "Teacher: I'm teaching".
  */
 @Override
 void work() {
   System.out.println("Teacher: I'm teaching");
 }

 /**
  * A method that prints "Teacher: I'm helping".
  */
 @Override
 public void help() {
   System.out.println("Teacher: I'm helping");
 }
}

/**
* A class that represents a driver.
*/
class DriverPolymorphism extends EmployeePolymorphism {
 /**
  * A method that prints "Driver: I'm driving".
  */
 @Override
 void work() {
   System.out.println("Driver: I'm driving");
 }

 /**
  * A method that prints "Driver: I'm helping".
  */
 @Override
 public void help() {
   System.out.println("Driver: I'm helping");
 }
}

/**
* A class that represents a doctor.
*/
class DoctorPolymorphism extends EmployeePolymorphism {
 /**
  * The speciality of the doctor.
  */
 String speciality;

 /**
  * A method that prints "Doctor: I'm treating".
  */
 @Override
 void work() {
   System.out.println("Doctor: I'm treating");
 }

 /**
  * A method that prints "Doctor: I'm helping".
  */
 @Override
 public void help() {
   System.out.println("Doctor: I'm helping");
 }
}

/**
* An interface that represents HelpAble2.
*/
interface HelpAble2 {
 /**
  * A method that helps.
  */
 void help();
}
