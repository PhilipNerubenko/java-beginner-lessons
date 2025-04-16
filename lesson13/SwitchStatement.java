package lesson13;

/**
* A class that demonstrates the switch statement in Java.
*/
public class SwitchStatement {}


/**
* A class that represents a student.
*/
class Student {
 /**
  * The grade of the student.
  */
 int grade;

 /**
  * A constructor for the Student class that takes in the grade.
  *
  * @param grade The grade of the student.
  */
 Student(int grade) {
   this.grade = grade;
 }

 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   Student student = new Student(2);
   // byte, short, char, int, String types can be used for the switch expression
   @SuppressWarnings("unused") int a = 1;
   @SuppressWarnings("unused") int b = 3;
   final int c = 1;
   final int d = 3;
   @SuppressWarnings("unused") final int e;
   @SuppressWarnings("unused") final int f;
   e = 1;
   f = 3;
   switch (student.grade) {
     // we can use case to compile time constants, enum constants, string literals
     case 2:
       System.out.println("Unsatisfactory");
       break;
     // no comile time constant
     // case a * b:
     // case e * f:
     case c* d:
       // case 3:
       System.out.println("Satisfactorily");
       break;
     case 4:
       System.out.println("Good");
       break;
     case 5:
       System.out.println("Great");
       break;
     default:
       System.out.println("Unknown score");
   }
 }
}
