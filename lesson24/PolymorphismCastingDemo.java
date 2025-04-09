package lesson24;

public class PolymorphismCastingDemo {
    public static void main(String[] args) {
        // up cast - converting from one class type to another type
        EmployeePolymorphism employee = new TeacherPolymorphism();
        EmployeePolymorphism employee1 = new DriverPolymorphism();
        EmployeePolymorphism employee2 = new DoctorPolymorphism();
        
        // down cast - converting from one class type to another type 
        //DoctorPolymorphism doctorCasting = (DoctorPolymorphism) employee2;
        System.out.println(((DoctorPolymorphism)employee2).speciality);
        
        HelpAble2 helpAble = new DoctorPolymorphism();
        // down casting
        System.out.println(((DoctorPolymorphism)helpAble).speciality);
        
        EmployeePolymorphism [] employees = {employee, employee1, employee2};

        // for (EmployeePolymorphism emp: employees){
        //     emp.work();
        // }

        // instanceof - checks whether an object is a class that implements a given interface
        System.out.println(employee instanceof TeacherPolymorphism);
        System.out.println(employee instanceof DriverPolymorphism);
    }
}

abstract class EmployeePolymorphism implements HelpAble2{
    void sleep() {
        System.out.println("Employee: I'm sleeping");
    }
    abstract void work();
}
class TeacherPolymorphism extends EmployeePolymorphism implements HelpAble2 {
    @Override
    void work() {
        System.out.println("Teacher: I'm teaching");
    }
    @Override
    public void help() {
        System.out.println("Teacher: I'm helping");
    }
}
class DriverPolymorphism extends EmployeePolymorphism {
    @Override
    void work() {
        System.out.println("Driver: I'm driving");
    }
    @Override
    public void help() {
        System.out.println("Driver: I'm helping");
    }
}
class DoctorPolymorphism extends EmployeePolymorphism {
    String speciality;
    @Override
    void work() {
        System.out.println("Doctor: I'm treating");
    }
    @Override
    public void help() {
        System.out.println("Doctor: I'm helping");
    }
}
interface HelpAble2 {
    void help();
}