package lesson20;

import java.util.ArrayList;

public class AllAboutMethodsArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add(1, "JavaScript");
        list.add("Java"); // Adding duplicate
        //list.add(7, "Java"); // Adding at index 7 (out of bounds, will throw an exception)

        for (String string : list) {
            System.out.println(string);
        }
        
        System.out.println();
        
        System.out.println("list.get(3) = " + list.get(3));
        // System.out.println("list.get(7) = " + list.get(7)); // This will throw an exception
        
        System.out.println();
        
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Assemble");
        list2.add("Pascal");
        list.addAll(list2); // Adding all elements from list2 to list)
        // list.addAll(1, list2); // Adding all elements from list2 at index 1
        // list.set(1, "!!!");
        // list.remove("Java"); // Removes first occurrence of "Java"
        // list.remove("JavaScript"); // Removes "JavaScript"
        for (String s: list) {
            System.out.print(s + " "); //
        }
        // list.clear(); // Clear all elements from the list
        System.out.println();
        System.out.println("list.size() = " + list.size()); // Size of the list
        for (String s: list) {
            System.out.print(s + " "); // This will not print anything as the list is empty
        }
    }
}
