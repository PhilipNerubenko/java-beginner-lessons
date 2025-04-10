package lesson26;

import java.io.*;

public class TryFinallyExceptionDemo {
    public static void main(String[] args) {
        File f = new File("test9.txt");

        try {
        FileInputStream fis = new FileInputStream(f);
        System.out.println("Everybody good day");
        } 
        catch (FileNotFoundException e){
            System.out.println("Exception: " + e);
        }
        catch (NullPointerException e){
            System.out.println("Exception: " + e);
        }
        finally {
            System.out.println("Bye everybody!");
        }

        System.out.println("Code have not exception");
    }
}
