public class Student {

    String name;
    String id;
    int age;
    double weight;


    Student(String StudentName, String StudentId, int
            StudentAge, double StudentWeight) {
        name = StudentName;
        id = StudentId;
        age = StudentAge;
        weight = StudentWeight;

    }

    void printInfo() {
        System.out.println("Name " + name + " Id " + id + " age " + age + " weight " + weight);


    }

}
