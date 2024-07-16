package org.example;

// Product Interface: Vehicle
interface Vehicle {
    void manufacture();
}

// Concrete Product: Car
class Car implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Car is being manufactured.");
    }
}

// Concrete Product: Motorcycle
class Motorcycle implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Motorcycle is being manufactured.");
    }
}
// Factory Interface: VehicleFactory
interface VehicleFactory {
    Vehicle createVehicle();
}
// Concrete Factory: SimpleVehicleFactory
class SimpleVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        // Logic to create and return a specific type of vehicle
        return new Car(); // For simplicity, always creating a Car
    }
}
// Client code
public class FactoryDesignEx{
    public static void main(String[] args) {
        VehicleFactory factory = new SimpleVehicleFactory();

        // Creating a car
        Vehicle car = factory.createVehicle();
        car.manufacture();

        Vehicle motorcycle = new Motorcycle();
        motorcycle.manufacture();
    }
}

