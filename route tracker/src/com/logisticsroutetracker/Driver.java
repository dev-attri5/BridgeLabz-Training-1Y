package com.logisticsroutetracker;

public class Driver {
    private final String driverId;
    private final String name;
    private final RouteLinkedList<Checkpoint> routeHistory;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    public void addCheckpoint(Checkpoint checkpoint) {
        routeHistory.addCheckpoint(checkpoint);
    }

    public boolean removeCheckpoint(String checkpointId) {
        return routeHistory.removeCheckpoint(checkpointId);
    }

    public Checkpoint findCheckpoint(String checkpointId) {
        return routeHistory.findCheckpoint(checkpointId);
    }

    public double getRouteScore() {
        return routeHistory.computeTotalDistance() - routeHistory.computeTotalPenalty();
    }

    public boolean hasConsistentCriticalRoute() {
        return routeHistory.hasAllCriticalCheckpointTypes("Delivery", "Fuel");
    }

    public void printRouteSummary() {
        System.out.println("Driver: " + driverId + " - " + name);
        System.out.println("Route Summary:");
        routeHistory.printRoute();
        System.out.printf("%nTotal Distance: %.1f km%n", routeHistory.computeTotalDistance());
        System.out.printf("Total Penalty: %.1f%n", routeHistory.computeTotalPenalty());
        System.out.printf("Route Score: %.1f%n", getRouteScore());
        System.out.println("Critical Route Check: " +
                (hasConsistentCriticalRoute()
                        ? "All required checkpoints present"
                        : "Required checkpoints missing"));
    }
}
