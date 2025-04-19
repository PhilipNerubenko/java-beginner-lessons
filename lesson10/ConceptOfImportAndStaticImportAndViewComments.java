package lesson10;
// this way we can specify a specific class that we want to import, while this class does not
// increase the size of the current file import
// lesson9.TypesOfVariablesAndLimitsOfTheirVisibilityCar; import lesson9.Student;

// this way we can specify all the classes in the current package that we want to import
// import lesson9.*;
// import lesson8.*;

// not allowed to use the same class name in two different files in the same package
// import lesson9.Student;
// import lesson8.Student;

// default imports
// import java.lang.*;

// static imports - we can use the static methods and variables of the class without specifying
// their name import static lesson9.TypesOfVariablesAndLimitsOfTheirVisibilityCar.count;

// all static imports
import static lesson9.TypesOfVariablesAndLimitsOfTheirVisibilityCar.*;

/**
 * A class that demonstrates the concept of import and static import and views comments.
 */
public class ConceptOfImportAndStaticImportAndViewComments {
  // this variable is priority to the static variable from the imported class
  // static int count = 99;
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    // full name of the class we want to use
    // lesson9.TypesOfVariablesAndLimitsOfTheirVisibilityCar car = new
    // lesson9.TypesOfVariablesAndLimitsOfTheirVisibilityCar("red", "v6");

    // if we are going to use only one class from the other file, we can write the name of the file
    // like this TypesOfVariablesAndLimitsOfTheirVisibilityCar car2 = new
    // TypesOfVariablesAndLimitsOfTheirVisibilityCar("black", "v8");

    // if the class name is the same for both packages, we have to write their full names even after
    // import lesson9.Student student = new lesson9.Student();

    // allowed to use full name or short name
    // java.lang.String str = new java.lang.String("hello");
    // String str1 = new String("hello");
    // TypesOfVariablesAndLimitsOfTheirVisibilityCar car = new
    // TypesOfVariablesAndLimitsOfTheirVisibilityCar("red", "v6");
    // System.out.println(TypesOfVariablesAndLimitsOfTheirVisibilityCar.count);
    System.out.println(count);

    // Views comments
    // End-of-line comments
    /*
     * Multiline comments
     */
    /**
     * Javadoc-комментарий
     * @author Автор
     * @version 1.0
     */
  }
}
