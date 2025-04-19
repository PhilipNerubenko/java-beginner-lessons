package lesson2;

/**
 * A class that demonstrates the use of primitive data types in Java.
 */
public class PrimitiveDataTypes {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    // bytes are 8 bits and have a range of -128 to 127
    // bytes are used to save memory in large arrays of integers, replace each integer with a byte
    byte myByte = 10;
    byte myByte2 = 20;
    byte myByte3 = 100;

    // short are 16 bits and have a range of -32,768 to 32,767
    short myShort = 5;
    short myShort2 = -10;
    short myShort3 = 0;

    // int default values, 32 bits and have a range of -2,147,483,648 to 2,147,483,647
    int myInt = 500;

    // need to use the suffix L to indicate a long type
    // longs are 64 bits and have a range of -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    long myLong = 1000; // this is an int, not a long
    long myLong2 = 1000000000000L;
    long myLong3 =
        1000000000000000000l; // need to use lowercase l because uppercase L is confused with 1

    // 32 bit floating point number and have a range of -3.40282347E+38 to 3.40282347E+38
    float myFloat = 3.14f; // need to use suffix f or suffix F for floats
    float myFloat2 = 2.5F; // need to use suffix f or suffix F for floats
    float myFloat3 = 20; // this is an int, not a float
    // float myFloat4 = 20.0; // this is a double, not a float

    // 64 bit floating point number and is default for decimals values
    // have a range of -1.79769313486231570E+308 to 1.79769313486231570E+308
    double myDouble = 10.5; // this is a double, no suffix is needed
    double myDouble2 = 20.0; // this is a double, no suffix is needed

    // 16 bit Unicode characters and have a range of \u0000 (or 0) to \uffff (or 65,535 inclusive)
    char myChar = 'a'; // this is a character, not a string
    char myChar2 = 'Ъ'; // this is a character, not a string
    char myChar3 = '7'; // this is a character, not a string
    char myChar4 = '\u00A9'; // this is the copyright symbol, 16 bit Unicode character
    char myChar5 = 65; // this is the ASCII value for A, 10 bit Unicode character
    char myChar6 = ' '; // this is a space

    // boolean type is either true or false
    boolean myBoolean = true; // this is a boolean
    boolean myBoolean2 = false; // this is a boolean

    System.out.println("byte: " + myByte);
    System.out.println("byte2: " + myByte2);
    System.out.println("byte3: " + myByte3);
    System.out.println("short: " + myShort);
    System.out.println("short2: " + myShort2);
    System.out.println("short3: " + myShort3);
    System.out.println("int: " + myInt);
    System.out.println("long: " + myLong);
    System.out.println("long2: " + myLong2);
    System.out.println("long3: " + myLong3);
    System.out.println("float: " + myFloat);
    System.out.println("float2: " + myFloat2);
    System.out.println("float3: " + myFloat3);
    System.out.println("double: " + myDouble);
    System.out.println("double2: " + myDouble2);
    System.out.println("char: " + myChar);
    System.out.println("char2: " + myChar2);
    System.out.println("char3: " + myChar3);
    System.out.println("char4: " + myChar4);
    System.out.println("char5: " + myChar5);
    System.out.println("char6: " + myChar6);
    System.out.println("boolean: " + myBoolean);
    System.out.println("boolean2: " + myBoolean2);

    int myInt2 = 60;

    int myInt3 = 0B111100; // binary literal representation of 60
    int myInt4 = 0b111100; // binary literal representation of 60

    int myInt5 = 074; // octal literal representation of 60

    int myInt6 = 0X3C; // hexadecimal literal representation of 60
    int myInt7 = 0x3C; // hexadecimal literal representation of 60

    System.out.println("int2: " + myInt2);
    System.out.println("int3: " + myInt3);
    System.out.println("int4: " + myInt4);
    System.out.println("int5: " + myInt5);
    System.out.println("int6: " + myInt6);
    System.out.println("int7: " + myInt7);

    int myInt8 = 1_000_000; // this is a valid integer literal with underscores
    System.out.println("int8: " + myInt8);
  }
}
