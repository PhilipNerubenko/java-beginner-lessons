package lesson19;

public class VariableArgumentsVarArgs {
    static void sum(int a, int b) {
        System.out.println("Sum of two numbers: " + (a + b));
    }
    static void sum(int a, int b, int c) {
        System.out.println("Sum of three numbers: " + (a + b + c));
    }
    // varags may be only one, and it must be the last parameter
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

    public void abc(int[]... arrays) {
        for (int[] array : arrays) {
            for (int number : array) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        sum (10, 20);
        sum (10, 20, 30);
        sum (10, 20, 30, 40);
        sum (10, 20, 30, 40, 50);
        // sum(new int[]{10, 20, 30, 40, 50});
        // sum(new int[]{10, 20, 30, 40, 50, 60});
    }
}
