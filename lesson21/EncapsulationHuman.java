package lesson21;

/**
 * A class that represents a human with encapsulation.
 */
public class EncapsulationHuman {
  /**
   * The gender of the human.
   */
  final String gender;

  /**
   * The name of the human.
   */
  private String name;

  /**
   * The age of the human.
   */
  private int age;

  /**
   * The weight of the human.
   */
  private int weight;

  /**
   * A boolean indicating if the human is smart.
   */
  private boolean isSmart;

  /**
   * A constructor for the EncapsulationHuman class that takes in the gender.
   *
   * @param gender The gender of the human.
   */
  public EncapsulationHuman(String gender) {
    this.gender = gender;
  }

  /**
   * A method that returns the name of the human.
   *
   * @return The name of the human.
   */
  public String getName() {
    return name;
  }

  /**
   * A method that sets the name of the human.
   *
   * @param name The name of the human.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A method that returns the age of the human.
   *
   * @return The age of the human.
   */
  public int getAge() {
    return age;
  }

  /**
   * A method that sets the age of the human.
   *
   * @param age The age of the human.
   */
  public void setAge(int age) {
    if (age >= 0 || age <= 120) {
      this.age = age;
    }
  }

  /**
   * A method that returns the weight of the human.
   *
   * @return The weight of the human.
   */
  public int getWeight() {
    return weight;
  }

  /**
   * A method that sets the weight of the human.
   *
   * @param weight The weight of the human.
   */
  public void setWeight(int weight) {
    if (weight >= 0) {
      this.weight = weight;
    }
  }

  /**
   * A method that returns if the human is smart.
   *
   * @return If the human is smart.
   */
  public boolean isSmart() {
    return isSmart;
  }
}

/**
 * A class that tests the EncapsulationHuman class.
 */
class EncapsulationHumanTest {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    EncapsulationHuman ih = new EncapsulationHuman("Male");
    ih.setName("Jack");
    ih.setAge(10);
    ih.setWeight(50);
    System.out.println(ih.getName());
    System.out.println(ih.getAge());
    System.out.println(ih.getWeight());
    ih.setWeight(-35);
    System.out.println(ih.getWeight());
  }
}
