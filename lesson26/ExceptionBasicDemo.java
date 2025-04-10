package lesson26;

public class ExceptionBasicDemo {
    public static void main(String[] args) {
        int array [] = {1, 4, 0};
        String s = null;
        
        System.out.println(s.length()); // NullPointerException
        System.out.println(array[5]); // ArrayIndexOutOfBoundsException
        System.out.println("hello");
    }
}