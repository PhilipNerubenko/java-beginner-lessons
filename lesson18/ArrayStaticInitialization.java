package lesson18;

/**
* A class that demonstrates array static initialization in Java.
*/
public class ArrayStaticInitialization {
 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   // Declaration array
   @SuppressWarnings("unused") int[] array1;
   String[] array2;
   double[][] array3;
   @SuppressWarnings("unused") int[][] array10;
   @SuppressWarnings("unused") double[] array7;

   // Allocation array
   array1 = new int[8];
   array2 = new String[3];
   array3 = new double[4][2];
   array10 = new int[3][];
   array7 = new double[2];
   // array10 = new int[][3]; // Error: array size must be specified for at least one dimension

   array2[0] = "Hello";
   array2[1] = "World";
   array2[2] = "!!!";
   // array2[3] = "!!!"; // Error: ArrayIndexOutOfBoundsException

   array3[0][0] = 3.14;
   array3[2][1] = 3.14;

   double[] array5;
   array5 = new double[2];
   array5[0] = 2.5;
   array5[1] = 3.5;
   array7 = array5;

   array3[1] = array5;

   System.out.println(array3[1][0]); // 2.5
   System.out.println(array3[1][1]); // 3.5
 }
}

