import products.Product;
import vehicles.*;
import vehicles.air.Radar;
import vehicles.land.Bicycle;
import vehicles.land.Car;
import vehicles.land.ILandVehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleStore {
    private static List<ILandVehicle> vehicles;

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
        Kayak kayak = new Kayak(10,20,new Product("Hello",10,2),"Strong");
        vehicles.get(1).getWheelCount();
        }
}
