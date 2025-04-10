package lesson26;

import java.io.*;

public class ExceptionPropagationDemo {
    void abc() throws FileNotFoundException{
        File f = new File("test.txt");
        FileInputStream fis = new FileInputStream(f);
        System.out.println("Everybody good day!");
    }

    void def() throws FileNotFoundException{
        abc();
    }

    public static void main(String[] args){
        ExceptionPropagationDemo t = new ExceptionPropagationDemo();

        try {
            t.def();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
