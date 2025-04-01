package lesson9;

public class Student {}

class StudentTest {
  public static void main(String[] args) {
    // objects are life in the heap
    Student s1 = new Student();
    Student s2 = new Student();
    // the object is suitable for garbage collector removal, but there is no guarantee that it will
    // be deleted
    Student s3;
    // the object is suitable for garbage collector removal, but there is no guarantee that it will
    // be deleted
    s1 = null;
  } // they will all be removed by the garbage collector after a certain time
}