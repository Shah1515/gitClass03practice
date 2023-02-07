package HomeWork;

public class Employee {

    String name;
    int id;

    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
}

class FullTime extends Employee {
    int perHour;

    FullTime(String name, int id, int perHour) {
        super(name, id);
        this.perHour = perHour;
    }
    void work1(){
        System.out.println(super.name + " work 40 hours per week");
    }
}

class Tester extends FullTime {
    int hours;
    Tester(String name, int id, int perHour, int hours) {
        super(name, id, perHour);
        this.hours = hours;
    }
    void salary(){
        System.out.println(name + " " + id + " has a salary per week " + (perHour * hours));
    }

    public static void main(String[] args) {
        Tester employee = new Tester("David" , 150, 100, 40);
        employee.salary();
    }
}
