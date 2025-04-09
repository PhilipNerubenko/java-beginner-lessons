package lesson22;

public class SuperKeywordDemo {
    String s1 = "hello";
    static double d1 = 3.14;
    int summa(int ... i) {
        int res = 0;
        for( int a : i) {
            res += a;
        }
        return res;
    }
    static void abc() {
        System.out.println("static method");
    }
}

class B8 extends SuperKeywordDemo {
    String s2 = super.s1 + " world";
    double d2 = super.d1; // static is ok here
    // analogous to
    // String s2 = s1 + " world";

    // recommended to avoid "super" in field declarations
    // String s1 = super.s1 + " world";

    boolean s1 = true;

    // static String s1 = super.s1; // doesn't work - static not allowed

    int summa(int ... i) {
        int res = super.summa(i);
        System.out.println("Super summa: " + res);
        super.abc();
        return res;
    }

    public static void main(String[] args) {
        B8 b = new B8();
        System.out.println(b.s2);
        System.out.println(b.s1);
        // System.out.println(super.s1); // doesn't work - super not allowed in static methods
    }
}