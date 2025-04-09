package lesson25;

import java.util.ArrayList;

public class WrapperClassDemo {
    public static void main(String[] args) {
        // autoboxing conversion from int to Integer
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);

        // autoboxing conversion from long to Long
        Number l = new Long(50);

        // unboxing conversion from Integer to int
        int i = list.get(0);
        System.out.println(i);
        // unboxing conversion from Long to long
        long l2 = (long)l;
        System.out.println(l2);

        String s1 = "50";
        String s2 = " 50"; // not allowed because there is a space
        String s3 = "true";
        String s4 = "anotherText";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1);
        boolean b = Boolean.parseBoolean(s3);
        boolean b2 = Boolean.parseBoolean(s4); // false
        System.out.println(b);
        System.out.println(b2);

        Integer i3 = Integer.valueOf(10); // int to Integer
        Double d1 = Double.valueOf("5.5"); // String to double
        System.out.println(i3);
        System.out.println(d1);

        Byte b3 = Byte.valueOf("127");
        Byte b4 = Byte.valueOf((byte)5);
        Byte b5 = new Byte((byte)6); // default int so it has to be cast

        int x = Byte.valueOf(b5); // Byte to int must be cast because of widening conversion
        System.out.println(x);
    }
}
