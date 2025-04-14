package lesson11;

/**
* A class that represents a student.
*/
public class ArgumentsMethodStudent {
 /**
  * The name of the student.
  */
 String name;

 /**
  * The course of the student.
  */
 int course;

 /**
  * The grade of the student.
  */
 double grade;

 /**
  * A constructor for the ArgumentsMethodStudent class that takes in the name, course, and grade.
  *
  * @param name The name of the student.
  * @param course The course of the student.
  * @param grade The grade of the student.
  */
 ArgumentsMethodStudent(String name, int course, double grade) {
   this.name = name;
   this.course = course;
   this.grade = grade;
 }

 /**
  * A static method that swaps the values of two students.
  *
  * @param student1 The first student.
  * @param student2 The second student.
  */
 public static void swap(ArgumentsMethodStudent student1, ArgumentsMethodStudent student2) {
   // temp reference on st1*
   ArgumentsMethodStudent temp = student1;
   // st1* -> st2*
   student1 = student2;
   // st2* -> temp*
   student2 = temp;
   // Everything is fine here
   System.out.println(student1.name);
 }

 /**
  * A static method that changes the name of a student.
  *
  * @param newName The new name of the student.
  */
 public static void changeName(ArgumentsMethodStudent newName) {
   // no link changes so name change on Kolya
   newName.name = "Kolya";
 }

 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   @SuppressWarnings("unused")
   ArgumentsMethodStudent st1 = new ArgumentsMethodStudent("Ivan", 3, 9.5);
   ArgumentsMethodStudent st2 = new ArgumentsMethodStudent("Petr", 1, 5.3);
   // // st1*, st2* dublicate, not original
   // swap(st1, st2);
   // // the old st1 and st2 still remain
   // System.out.println(st1.name);
   // System.out.println(st2.name);
   // st2* dublicate, not original
   changeName(st2);
   System.out.println(st2.name);
 }
}

