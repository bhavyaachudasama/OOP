public class Rectangle {

    
    double width = 1;
    double height = 1;

    
    Rectangle() {
        
    }

    
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    
    double getArea() {
        return width * height;
    }

    
    double getPerimeter() {
        return 2 * (width + height);
    }

    
    public static void main(String[] args) {

        
        Rectangle r1 = new Rectangle();
        System.out.println("Rectangle 1 (Default Values):");
        System.out.println("Width = " + r1.width);
        System.out.println("Height = " + r1.height);
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());

        
        Rectangle r2 = new Rectangle(5, 3);
        System.out.println("\nRectangle 2 (Custom Values):");
        System.out.println("Width = " + r2.width);
        System.out.println("Height = " + r2.height);
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());
    }
}