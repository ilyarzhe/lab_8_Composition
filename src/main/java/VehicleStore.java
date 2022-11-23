import products.Product;
import vehicles.*;
import vehicles.air.Radar;
import vehicles.land.Bicycle;
import vehicles.land.Car;

import java.util.ArrayList;
import java.util.List;

public class VehicleStore {
    private static List<IVehicle> vehicles;

    public static void main(String[] args) {
        vehicles = new ArrayList<>();
        // create a bike using composition, and call methods from its components
        Bicycle bike1 = new Bicycle(10, 20, new Product("BMX", 350, 6));
        vehicles.add(bike1);

        System.out.println(bike1.getWheelCount());
        System.out.println(bike1.getTitle());
        System.out.println(bike1.getInventory());

        // create a car using composition, and call methods from its multiple components
        Car car1 = new Car(200, 120, new Product("2015 Dacia Duster", 10000, 3),
        new Engine(100, 150));
        vehicles.add(car1);

        car1.startEngine();
        System.out.println(car1.getFuelLevel());
        System.out.println(car1.getPrice());
        System.out.println("____________");

        // lab tests (water vehicle related)...
        Helicopter helicopter = new Helicopter(20,100,new Product("SuperHeli",100,20),new Radar(1234234,50));
        System.out.println(helicopter.getSerialNumber());

        Speedboat speedboat = new Speedboat(30,150,new Product("Helop",10,2),"Hello",new Motor(10,200));
        speedboat.getFuelLevel();
    }
}
