package lesson20;

import java.util.ArrayList;

public class ReplaceElementsArrayListWithoutMethods {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("World");
        StringBuilder sb3 = new StringBuilder("Java");
    
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).append("!");
        }

        for (StringBuilder sb : list) {
            System.out.println(sb);
        }

        System.out.println();

        list.remove(2);
        //list.remove(3); // IndexOutOfBoundsException
        list.remove(sb1);
        for (StringBuilder sb : list) {
            System.out.println(sb);
        }
    }
}
