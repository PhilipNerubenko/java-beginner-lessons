package lesson20;

import java.util.ArrayList;

public class AllAboutMethodsArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("Java"));
        list.add(new String("Python"));
        list.add(new String("C++"));
        list.add(new String("JavaScript"));
        
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println("\n" + list.indexOf(new String("Java"))); // 0
        System.out.println(list.lastIndexOf(new String("C++"))); // 3
        System.out.println(list.size()); // 4
        System.out.println(list.isEmpty()); // false
        System.out.println(list.contains(new String("Java"))); // true
        System.out.println(list.toString());
        
    }
}
