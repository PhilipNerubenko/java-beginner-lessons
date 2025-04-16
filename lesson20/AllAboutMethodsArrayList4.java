package lesson20;

import java.util.ArrayList;
import java.util.Collections;

/**
* A class that demonstrates the methods of the ArrayList class in Java.
*/
public class AllAboutMethodsArrayList4 {
 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   String s1 = "A";
   String s2 = "B";
   String s3 = "C";
   String s4 = "D";
   ArrayList<String> list = new ArrayList<>();

   list.add(s3);
   list.add(s1);
   list.add(s4);
   list.add(s2);
   // System.out.println("Before: " + list);
   // Collections.sort(list);
   // System.out.println("After: " + list);
   ArrayList<String> list2 = list;
   System.out.println(list.equals(list2)); // true
 }
}

