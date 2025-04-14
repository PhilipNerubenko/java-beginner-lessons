package lesson19;

/**
* A class that demonstrates variable arguments (varargs) in Java.
*/
public class VariableArgumentsVarArgs {
 /**
  * A static method that prints the sum of two numbers.
  *
  * @param a The first number.
  * @param b The second number.
  */
 static void sum(int a, int b) {
   System.out.println("Sum of two numbers: " + (a + b));
 }

 /**
  * A static method that prints the sum of three numbers.
  *
  * @param a The first number.
  * @param b The second number.
  * @param c The third number.
  */
 static void sum(int a, int b, int c) {
   System.out.println("Sum of three numbers: " + (a + b + c));
 }

 // varags may be only one, and it must be the last parameter
 /**
  * A static method that prints the sum of variable arguments.
  *
  * @param numbers The variable arguments.
  */
 static void sum(int... numbers) {
   int sum = 0;
   // Standart for loop
   // for (int i = 0; i < numbers.length; i++) {
   //     sum += numbers[i];
   // }
   // For each loop
   for (int number : numbers) {
     sum += number;
   }
   System.out.println("Sum of variable arguments: " + sum);
 }

 // after compilation, varargs converts ... into an array, and if
 // int... and int[] are used together, the compiler will throw an error
 // static void sum(int[] numbers) {
 //     int sum = 0;
 //     // Standart for loop
 //     // for (int i = 0; i < numbers.length; i++) {
 //     //     sum += numbers[i];
 //     // }
 //     // For each loop
 //     for (int number : numbers) {
 //         sum += number;
 //     }
 //     System.out.println("Sum of variable arguments: " + sum);
 // }

 /**
  * A method that prints the elements of variable arguments arrays.
  *
  * @param arrays The variable arguments arrays.
  */
 public void abc(int[]... arrays) {
   for (int[] array : arrays) {
     for (int number : array) {
       System.out.print(number + " ");
     }
     System.out.println();
   }
 }

 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   sum(10, 20);
   sum(10, 20, 30);
   sum(10, 20, 30, 40);
   sum(10, 20, 30, 40, 50);
   // sum(new int[]{10, 20, 30, 40, 50});
   // sum(new int[]{10, 20, 30, 40, 50, 60});
 }
}

