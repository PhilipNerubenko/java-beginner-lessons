package lesson16;

/**
* A class that demonstrates the class String in Java.
*/
public class AllAboutClassString {
 /**
  * The main method that is called when the program is run.
  *
  * @param args The command line arguments.
  */
 public static void main(String[] args) {
   // Create class String with value "Good morning"
   String str1 = new String("Good morning"); // On Heap str1 -> "Good morning"

   // Create another object of class String with value "Bad day"
   String str2 = new String("Bad day"); // On Heap str2 -> "Bad day"

   // Create third object of class String with value "Bad day"
   String str3 = new String("Bad day"); // On Heap str3 -> "Bad day"

   /* Exception to the Rule - Creating String object with String Literal
    * If you create a String object using String Literal,
    * it will be created in the String Pool, not on the Heap.
    * */
   String str4 = "Good morning"; // String Literal -> String Pool

   // Object str5 will refer to the same String Object as str4
   String str5 = "Good morning"; // String Literal -> String Pool, str5 -> str4

   // Compare the Objects created with String Literal and String Object
   System.out.println(str1 == str2); // false
   System.out.println(str2 == str3); // false
   System.out.println(str3 == str4); // false
   System.out.println(str4 == str5); // true
   System.out.println(str1 == str5); // false
   System.out.println("Good morning" == str5); // true
   System.out.println("Good morning" == str1); // false

   System.out.println();

   // String have value in private char array, he's immutable and final
   System.out.println(str1.charAt(0)); // G
   System.out.println(str1.charAt(5)); // m

   // Get length of the String
   System.out.println(str1.length()); // 12

   System.out.println();

   // None of the String class methods change individual elements of a char array
   str1.toUpperCase(); // "GOOD MORNING"
   str1.toLowerCase(); // "good morning"
   System.out.println(str1); // "Good morning"

   // Convert String to Lower Case
   String lowerCase = str1.toLowerCase();
   System.out.println(lowerCase); // "good morning"

   System.out.println();

   // Methods are String
   String name = "James Bond";

   int length = name.length();

   System.out.println("Length of name is " + length); // Length of name is 10
   char firstLetter = name.charAt(0); // Get First Letter of Name

   System.out.println();

   System.out.println("char of name index 0 is " + firstLetter); // char of name is 0 is J
   int index = name.indexOf('B'); // Get Index of Letter B
   System.out.println("index of letter B is " + index); // index of letter B is 6
   int index1 = name.indexOf('B', 7); // Get Index of Letter B, starting from index 7
   System.out.println("index of letter B is " + index1); // index of letter B is 6
   int index2 = name.indexOf("Bond"); // Get Index of String Bond
   System.out.println("index of string Bond is " + index2); // index of string Bond is 6

   System.out.println();

   boolean isStartsWith = name.startsWith("Ja", 5); // Check if String starts with Ja
   System.out.println("is name starts with Ja? " + isStartsWith); // is name starts with Ja? true
   boolean isEndsWith = name.endsWith("Bond"); // Check if String ends with Bond
   System.out.println("is name ends with Bond? " + isEndsWith); // is name ends with Bond? true

   System.out.println();

   String firstName = name.substring(0, 5); // Get First Name from String
   System.out.println("substring is " + firstName); // James
   System.out.println(name); // James Bond
   String lastName = name.substring(6); // Get Last Name from String
   System.out.println("substring is " + lastName); // Bond
   System.out.println(name); // James Bond

   System.out.println();

   String name1 = "  James Bond  ";
   System.out.println(name1);
   System.out.println(name1.trim()); // Remove White Spaces, and create new String

   System.out.println();

   String replaceString = name1.replace(' ', '-'); // Replace all Spaces with Hyphens
   System.out.println(replaceString); // James-Bond

   String reString = name1.replace("James", "Johan"); // Replace all James with Johan
   System.out.println(reString); // Johan Bond

   String replaceFirstString = name1.replace("James", "James"); // Replace first James with Johan
   System.out.println(replaceFirstString == name1); // false because new String is created

   String replaceAllString = name1.replace('J', 'J'); // Replace James with Johan
   System.out.println(replaceAllString == name1); // true because same String is returned

   System.out.println();

   String name2 = "James Bond";
   String str = " hello";
   System.out.println(name2.concat(str)); // Concatenate Strings

   System.out.println();

   String name3 = "James Bond";
   boolean isContains = name3.contains("Bond"); // Check if String contains Bond
   System.out.println("is name3 contains Bond? " + isContains); // is name3 contains Bond? true

   System.out.println();

   String s1 = "Hello World";
   String s2 = "Yeeeeeeeeee";

   // method chaining left to right
   String s3 = s1.concat(s2).trim().replace("Yeeeeeeeeee", "Yes").substring(6, 10);
   System.out.println("s3 is " + s3);
   System.out.println("s1 is " + s1.substring(s1.indexOf('W')));

   System.out.println();

   // String equality definition
   String name4 = "James Bond";
   String name5 = "James Bond";
   System.out.println(name4 == name5); // true because same String is returned
   System.out.println(name4.equals(name5)); // true because same String is returned

   String name6 = "James Bond";
   String name7 = new String("James Bond");
   System.out.println(name6 == name7); // false because different String is returned
   System.out.println(name != name7); // true because different String is returned
   System.out.println(name6.equals(name7)); // true because same String is returned
 }
}
