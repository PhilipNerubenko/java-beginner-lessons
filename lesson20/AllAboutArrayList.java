package lesson20;
import java.util.ArrayList;
import java.util.List;

/**
 * A class that demonstrates the class ArrayList in Java.
 */
public class AllAboutArrayList {
  @SuppressWarnings("unchecked")
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    /* ArrayList is a resizable array implementation of the List interface
     * It can hold objects of any type, including user-defined classes
     * It is part of the Java Collections Framework
     * It is not synchronized, so it is not thread-safe
     */
    @SuppressWarnings("rawtypes") ArrayList list = new ArrayList();
    list.add("Hello");
    Car c = new Car();
    list.add(c);
    Student s = new Student();
    list.add(s);
    list.add(new StringBuilder("good"));

    ArrayList<String> list2 = new ArrayList<>(30);
    ArrayList<String> list5 = new ArrayList<>(list2);
    System.out.println(list2 == list5); // false

    list2.add("World");

    List<StringBuilder> list3 = new ArrayList<>();
    list3.add(new StringBuilder("Hello"));
    list3.add(new StringBuilder("World"));
  }
}

/**
 * A class that represents a car.
 */
class Car {}

/**
 * A class that represents a student.
 */
class Student {}
