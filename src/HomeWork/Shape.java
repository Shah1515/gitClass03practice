package HomeWork;

public class Shape {
    double radius;

    Shape (double R) {
        this.radius = R;

    }

} class Circle extends Shape {

    double de = 2.123;
    double area;

    Circle(double R) {
        super(R);
        area = (R + R) * de;
    }

    void printR() {
        System.out.println("the area of the circle is " + area);


    }

    public static void main(String[] args) {
        Circle ce = new Circle(20);
        ce.printR();
    }

}
