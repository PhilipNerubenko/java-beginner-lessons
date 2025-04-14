package lesson28;

public class LambdaParametersDemo {
    static void def(StringCalculator t){
        // System.out.println(t.abc("Hello"));
        System.out.println(t.abc("hello", "bye"));
    }
    public static void main(String[] args) {
        //def(x -> x.length()); // size of string word "hello"
        def((x,y) -> x.length() + y.length()); // size of string word "hello" and "bye"
    }
}

interface StringCalculator{
    // int abc(String s);
    int abc(String s1, String s2);
}