package lesson17;

/**
 * A class that represents a car.
 */
class Car {}

/**
 * A class that demonstrates the class StringBuilder in Java.
 */
public class AllAboutClassStringBuilder {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    // sb initialized with default capacity 16
    StringBuilder sb = new StringBuilder();
    // sb1 initialized with a string, capacity is 16 + length of string
    StringBuilder sb1 = new StringBuilder("Good Morning");
    // sb2 initialized with a capacity of 10
    StringBuilder sb2 = new StringBuilder(10);
    // sb4 reference to new StringBuilder object with the same content as sb1
    StringBuilder sb4 = new StringBuilder(sb1);

    System.out.println(sb.length()); // 0
    System.out.println(sb.capacity()); // 16
    System.out.println(sb1.length()); // 12
    System.out.println(sb1.capacity()); // 28
    System.out.println(sb2.length()); // 0
    System.out.println(sb2.capacity()); // 10
    System.out.println(sb4.length()); // 12
    System.out.println(sb4.capacity()); // 28
    System.out.println(sb1.charAt(4)); // space character
    System.out.println(sb1.indexOf("M")); // 5
    // Difference in method parameters between String class and StringBuilder
    // System.out.println(sb1.indexOf('o')); // 1
    String s = sb1.substring(0, 4); // Good
    System.out.println(s);

    // subSequence method is similar to substring but returns CharSequence
    System.out.println(sb1.subSequence(5, 8)); // Mor
    System.out.println();
    // sb1.append(22);
    // System.out.println(sb1); // Good Morning22
    // sb1.append(true);
    // System.out.println(sb1); // Good Morning22true
    // sb1.append(sb1);
    // System.out.println(sb1); // Good Morning22trueGood Morning22trueGood Morning22trueGood
    // Morning22true sb1.append("Hello"); System.out.println(sb1); // Good Morning22trueGood
    // Morning22trueGood Morning22trueGood Morning22trueHello sb1.append(new Car());
    // System.out.println(sb1); // Good Morning22trueGood Morning22trueGood Morning22trueGood
    // Morning22trueHellolesson17.Car@reference
    System.out.println(sb1.insert(
        4, "55")); // Good55 Morning22trueGood Morning22trueGood Morning22trueGood Morning22true
    StringBuilder sb3 = new StringBuilder("Hello World");
    System.out.println(sb3); // Hello World
    sb3.delete(3, 6);
    System.out.println(sb3); // HelWorld
    sb3.deleteCharAt(2);
    System.out.println(sb3); // HeWorld
    System.out.println(sb3.reverse()); // dlroW eH
    System.out.println(sb3); // dlroW eH

    StringBuilder sb5 = new StringBuilder("Hello World");
    sb5.replace(0, 5, "Good");
    System.out.println(sb5 + "\n"); // Good World

    StringBuilder sb6 = new StringBuilder("Hello World!");
    String str = null;
    str = sb6.append(" How are you?").substring(sb6.indexOf("W"), sb6.indexOf("!"));
    System.out.println(str + "\n"); // World

    // in the StringBuilder class equals does not work the same way as in String, it works the same
    // as the standard == operation
    StringBuilder sb7 = new StringBuilder("Hello");
    StringBuilder sb8 = new StringBuilder("Hello");
    System.out.println(sb7 == sb8); // false
    System.out.println(sb7.equals(sb8)); // false
  }
}
