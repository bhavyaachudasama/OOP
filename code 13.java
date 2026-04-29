import java.util.Scanner;
class Shape {
    double d1, d2;

    
    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}


class Triangle extends Shape {

    
    double getArea() {
        return 0.5 * d1 * d2; 
    }
}
class Rectangle extends Shape {

    
    double getArea() {
        return d1 * d2; 
    }
}


public class TestShape {
    public static void main(String[] args) {

       
        Triangle t = new Triangle();
        t.getData(10, 5);
        System.out.println("Area of Triangle: " + t.getArea());

        
        Rectangle r = new Rectangle();
        r.getData(4, 6);
        System.out.println("Area of Rectangle: " + r.getArea());
    }
}