package lesson8;

/**
 * A class that represents a student.
 */
public class StudentNonAccessStatic {
  /**
   * The name of the student.
   */
  String name;

  /**
   * The course of the student.
   */
  int course;

  // belongs to an object
  // int count;

  /**
   * A static field that belongs to the class.
   */
  static int count;

  // constant belongs to the class
  static final int constant = 10;

  int a;

  /**
   * A constructor for the StudentNonAccessStatic class that takes in the name and course.
   *
   * @param name The name of the student.
   * @param course The course of the student.
   */
  public StudentNonAccessStatic(String name, int course) {
    count++;
    this.name = name;
    this.course = course;
    System.out.println("Student № " + count + " created");
  }

  /**
   * A static method that prints the number of created students.
   */
  public static void showCount() {
    System.out.println("All created students " + count);
  }

  /**
   * A method that prints a welcome message.
   */
  public void showInfo() {
    System.out.println("Welcome to the Student class!");
  }

  void abc() {
    a++;
    count++;
  }

  static void abcd() {
    // variable belongs to an object, not to the class
    // a++;
    count++;
  }

  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    abcd();
    // call without creating an object
    // abc();
  }
}

/**
 * A class that tests the StudentNonAccessStatic class.
 */
class StudentTest {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    StudentNonAccessStatic st1 = new StudentNonAccessStatic("Mike", 1);
    StudentNonAccessStatic st2 = new StudentNonAccessStatic("Anna", 3);
    StudentNonAccessStatic st3 = new StudentNonAccessStatic("Kate", 2);
    StudentNonAccessStatic st4 = new StudentNonAccessStatic("Alex", 1);

    System.out.println(StudentNonAccessStatic.count);
    StudentNonAccessStatic.showCount();

    // Is bad practice
    System.out.println(st1.count);
    System.out.println(st2.count);
    System.out.println(st3.count);
    System.out.println(st4.count);
    st1.showCount();
  }
}
