package com.Bridgelabz.Generics;

import java.util.*;
public class GenericProblem11FleetManager {
    public static void main(String[] args) {
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck("Tata 407"));
        truckFleet.addVehicle(new Truck("Ashok Leyland Dost"));
        truckFleet.showFleet("Truck fleet");

        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike("Royal Enfield"));
        bikeFleet.addVehicle(new Bike("Yamaha R15"));
        bikeFleet.showFleet("Bike fleet");
    }

    private static final class FleetManager<T extends Vehicle> {
        private final List<T> vehicles = new ArrayList<>();

        void addVehicle(T vehicle) {
            vehicles.add(vehicle);
        }

        void showFleet(String title) {
            System.out.println(title + ":");
            for (T vehicle : vehicles) {
                System.out.println("- " + vehicle.model());
            }
        }
    }

    private abstract static class Vehicle {
        private final String model;

        Vehicle(String model) {
            this.model = model;
        }

        String model() {
            return model;
        }
    }

    private static final class Truck extends Vehicle {
        Truck(String model) {
            super(model);
        }
    }

    private static final class Bike extends Vehicle {
        Bike(String model) {
            super(model);
        }
    }
}
