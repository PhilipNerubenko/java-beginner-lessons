package lesson21.p1;

import lesson21.IncapsulationHuman;

/**
* A class that tests the IncapsulationHuman class.
*/
public class Test1 {
   /**
    * The main method that is called when the program is run.
    *
    * @param args The command line arguments.
    */
   public static void main(String[] args) {
       IncapsulationHuman ih = new IncapsulationHuman("Male");
       ih.setName("Jack");
       ih.setAge(10);
       ih.setWeight(50);
       System.out.println(ih.getName());
       System.out.println(ih.getAge());
       System.out.println(ih.getWeight());
   }

}

