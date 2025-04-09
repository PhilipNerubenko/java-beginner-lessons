package lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class AllAboutMethodsArrayList4 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> list = new ArrayList<>();
        
        list.add(s3);
        list.add(s1);
        list.add(s4);
        list.add(s2);
        // System.out.println("Before: " + list);
        // Collections.sort(list);
        // System.out.println("After: " + list);
        ArrayList<String> list2 = list;
        System.out.println(list.equals(list2)); // true
    }
}
