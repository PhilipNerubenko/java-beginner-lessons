package lesson20;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorAndListIterator {
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

        ListIterator<String> iterator = list.listIterator();
        // Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            // String element = iterator.next();
            // System.out.println(element);
            iterator.next();
            iterator.remove();
        }
        System.out.println("List size: " + list.size());
        System.out.println("List contents: " + list);
    }
}
