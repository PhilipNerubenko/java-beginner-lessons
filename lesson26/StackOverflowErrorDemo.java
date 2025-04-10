package lesson26;

public class StackOverflowErrorDemo {
    static void bcv() {
        System.out.println("Run method abc");
        bcv();
    }
    public static void main(String[] args) {
        // RuntimeException and Error - unchecked exceptions, they should not be processed
        try {
        bcv();
        } catch (StackOverflowError e) {
            System.out.println("Error: " + e);
        }
    }
}
