package com.logisticsroutetracker;

public class RouteTrackerSystem {
    public static void main(String[] args) {
        ConsolePrinter.section("Route Tracker System");

        Driver driver = new Driver("D1204", "Kavita Nair");
        driver.addCheckpoint(new DeliveryCheckpoint("CP01", "Warehouse A", 25.0, 30, 40));
        driver.addCheckpoint(new FuelCheckpoint("CP02", "Pump 12", 15.0, 10, 10));
        driver.addCheckpoint(new RestCheckpoint("CP03", "Motel X", 30.0, 20, 25));
        driver.addCheckpoint(new DeliveryCheckpoint("CP04", "Client Hub", 50.0, 45, 60));

        driver.printRouteSummary();

        ConsolePrinter.heading("Lookup and Removal Demo");
        Checkpoint found = driver.findCheckpoint("CP02");
        System.out.println("Found checkpoint CP02: " +
                (found == null ? "Not found" : found.getType() + " - " + found.getLocationName()));

        boolean removed = driver.removeCheckpoint("CP02");
        System.out.println("Removed CP02: " + removed);
        System.out.println("Critical Route Check After Removal: " +
                (driver.hasConsistentCriticalRoute()
                        ? "All required checkpoints present"
                        : "Required checkpoints missing"));
    }
}
