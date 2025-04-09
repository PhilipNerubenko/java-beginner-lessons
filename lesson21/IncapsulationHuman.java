package lesson21;

public class IncapsulationHuman {
    final String gender;
    private String name;
    private int age;
    private int weight;
    private boolean isSmart;

    public IncapsulationHuman(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 || age <= 120) {
        this.age = age;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 0) {
        this.weight = weight;
        }
    }
    
    public boolean isSmart() {
        return isSmart;
    }
}

class IncapsulationHumanTest {
    public static void main(String[] args) {
        IncapsulationHuman ih = new IncapsulationHuman("Male");
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