public class VolumeCalculator {

    
    double calculateVolume(double side) {
        return side * side * side;
    }

    
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
    
    double calculateVolume(int radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

  
    public static void main(String[] args) {

        VolumeCalculator vc = new VolumeCalculator();

      
        double cubeVolume = vc.calculateVolume(3.0);

        
        double cuboidVolume = vc.calculateVolume(4.0, 5.0, 6.0);

       
        double sphereVolume = vc.calculateVolume(3);

        
        System.out.println("Volume of Cube: " + cubeVolume);
        System.out.println("Volume of Rectangular Cube: " + cuboidVolume);
        System.out.println("Volume of Sphere: " + sphereVolume);
    }
}