package lesson23;

/**
* A class that demonstrates interface implementation in Java.
*/
public class InterfaceImplementationDemo {
 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   HelpAble h = new Driver();
   SwimAble s = new Driver();
   Employee e = new Driver();
   System.out.println(h.a);
   h.help();
   h.putOutTheFire();
   s.swim();
 }
}

/**
* A class that represents an employee.
*/
class Employee {
 /**
  * The salary of the employee.
  */
 double salary = 100;

 /**
  * The name of the employee.
  */
 String name;

 /**
  * The age of the employee.
  */
 int age;

 /**
  * The experience of the employee.
  */
 int experience;

 /**
  * A method that prints "eating".
  */
 void eat() {
   System.out.println("eating");
 }

 /**
  * A method that prints "sleeping".
  */
 void sleep() {
   System.out.println("sleeping");
 }
}

/**
* A class that represents a teacher.
*/
class Teacher extends Employee implements HelpAble {
 /**
  * The count of students of the teacher.
  */
 int countStudent;

 /**
  * A method that prints "teaching".
  */
 void teach() {
   System.out.println("teaching");
 }

 /**
  * A method that prints "Teacher helping".
  */
 @Override
 public void help() {
   System.out.println("Teacher helping");
 }

 /**
  * A method that prints "Teacher putting out the fire".
  */
 @Override
 public void putOutTheFire() {
   System.out.println("Teacher putting out the fire");
 }
}

/**
* A class that represents a driver.
*/
class Driver extends Employee implements HelpAble, SwimAble {
 /**
  * The name of the car of the driver.
  */
 String nameCar;

 /**
  * A method that prints "driving".
  */
 void drive() {
   System.out.println("driving");
 }

 /**
  * A method that prints "Driver helping".
  */
 @Override
 public void help() {
   System.out.println("Driver helping");
 }

 /**
  * A method that prints "Driver putting out the fire".
  */
 @Override
 public void putOutTheFire() {
   System.out.println("Driver putting out the fire");
 }

 /**
  * A method that prints "Driver is swimming".
  */
 @Override
 public void swim() {
   System.out.println("Driver is swimming");
 }
}

/**
* An interface that represents HelpAble.
*/
interface HelpAble {
 // public abstract may be not written because it's default
 /**
  * A method that helps.
  */
 public abstract void help();

 /**
  * A method that puts out the fire.
  */
 void putOutTheFire();

 // public static final int a = 10;
 // public static final is default may be not written
 /**
  * A constant that represents a.
  */
 int a = 10;
}

/**
* An interface that represents SwimAble.
*/
interface SwimAble {
 // public abstract may be not written because it's default
 /**
  * A method that swims.
  */
 void swim();
}

/**
* An abstract class that implements SwimAble.
*/
abstract class Y implements SwimAble {}

/**
* An abstract class that extends Y.
*/
abstract class X extends Y {}

/**
* A class that extends X.
*/
class Z extends X {
 /**
  * A method that prints "Z is swimming".
  */
 @Override
 public void swim() {
   System.out.println("Z is swimming");
 }
}
