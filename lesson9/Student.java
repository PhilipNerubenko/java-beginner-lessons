package lesson9;

/**
 * A class that represents a student.
 */
public class Student {}

/**
 * A class that tests the Student class.
 */
class StudentTest {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    // objects are life in the heap
    @SuppressWarnings("unused") Student s1 = new Student();
    @SuppressWarnings("unused") Student s2 = new Student();
    // the object is suitable for garbage collector removal, but there is no guarantee that it will
    // be deleted
    @SuppressWarnings("unused") Student s3;
    // the object is suitable for garbage collector removal, but there is no guarantee that it will
    // be deleted
    s1 = null;
  } // they will all be removed by the garbage collector after a certain time
}
