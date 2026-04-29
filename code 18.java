import java.util.Scanner;
abstract class Vehicle {

    
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {

    String fuel;

    Car(String fuel) {
        this.fuel = fuel;
    }

    
    String fuelType() {
        return fuel;
    }

    
    int noOfWheels() {
        return 4;
    }
}


class Bike extends Vehicle {

    String fuel = "Petrol";

    
    String fuelType() {
        return fuel;
    }

    
    int noOfWheels() {
        return 2;
    }
}

public class TestVehicle {
    public static void main(String[] args) {

        
        Car car = new Car("Diesel");
        System.out.println("Car:");
        System.out.println("Fuel Type: " + car.fuelType());
        System.out.println("Number of Wheels: " + car.noOfWheels());

        System.out.println("\n-------------------\n");

        
        Bike bike = new Bike();
        System.out.println("Bike:");
        System.out.println("Fuel Type: " + bike.fuelType());
        System.out.println("Number of Wheels: " + bike.noOfWheels());
    }
}