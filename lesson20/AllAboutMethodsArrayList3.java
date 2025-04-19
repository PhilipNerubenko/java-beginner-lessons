package lesson20;

import java.util.*;

/**
 * A class that demonstrates the methods of the ArrayList class in Java.
 */
public class AllAboutMethodsArrayList3 {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    StringBuilder sb1 = new StringBuilder("A");
    StringBuilder sb2 = new StringBuilder("B");
    StringBuilder sb3 = new StringBuilder("C");
    ArrayList<StringBuilder> list = new ArrayList<>();
    list.add(sb1);
    list.add(sb2);
    list.add(sb3);
    // ArrayList<StringBuilder> newList = (ArrayList<StringBuilder>)list.clone();
    // System.out.println(list == newList); // false
    // System.out.println(list.get(0) == newList.get(0)); // true
    // list.get(0).append("!");
    // list.set(0, new StringBuilder("D"));
    // System.out.println(newList.get(0));
    // Object[] array = list.toArray();
    // for (Object element : array) {
    //     System.out.print(element + " ");
    // }
    // StringBuilder[] array2 = list.toArray(new StringBuilder[10]);
    // for (StringBuilder element : array2) {
    //     System.out.print(element + " ");
    // }
    StringBuilder[] array3 = {sb1, sb2, sb3, sb3};
    List<StringBuilder> list2 = Arrays.asList(array3);
    System.out.println(list2);
    array3[0].append("!");
    System.out.println(list2);
    array3[0] = new StringBuilder("!!!!");
    System.out.println(list2);
  }
}
