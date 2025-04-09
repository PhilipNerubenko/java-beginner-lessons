package lesson20;
import java.util.ArrayList;
import java.util.List;

public class AllAboutArrayList {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        /* ArrayList is a resizable array implementation of the List interface
        * It can hold objects of any type, including user-defined classes
        * It is part of the Java Collections Framework
        * It is not synchronized, so it is not thread-safe
        */
        @SuppressWarnings("rawtypes")
        ArrayList list = new ArrayList();
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

class Car {}
class Student{}