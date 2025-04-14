package lesson18;

import java.util.Arrays;

/**
* A class that demonstrates the consideration of the Arrays class in Java.
*/
public class ConsiderationOfTheArraysClassIsMinimal {
 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};

   for (int i = 0; i < array1.length; i++) {
     System.out.print(array1[i] + " ");
   }
   System.out.println();

   Arrays.sort(array1);

   for (int i = 0; i < array1.length; i++) {
     System.out.print(array1[i] + " ");
   }
   System.out.println();

   /* The Arrays class provides a static method to search for an element in a sorted array.
    * The method returns the index of the element if it is found, or a negative value if it is not
    * found.
    */
   int index = Arrays.binarySearch(array1, -8);
   int index1 = Arrays.binarySearch(array1, 10);
   // index = 8, index1 = -8 - 1 = -9
   System.out.println("Index of -8: " + index); // Index of -8: 0
   System.out.println("Index of 10: " + index1); // Index of 10: -9
 }
}
