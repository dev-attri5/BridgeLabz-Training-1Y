package com.Bridgelabz.collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Scenario03RideSharingDispatch {
    public static void main(String[] args) {
        Queue<RideRequest> incoming = new LinkedList<>();
        incoming.add(new RideRequest("R1", "Airport", 2));
        incoming.add(new RideRequest("R2", "Station", 1));

        Set<Driver> availableDrivers = new LinkedHashSet<>(Arrays.asList(
                new Driver("D1", "Rahul"),
                new Driver("D2", "Sneha")
        ));

        PriorityQueue<RideRequest> priorityQueue = new PriorityQueue<>((a, b) -> Integer.compare(b.priority, a.priority));
        priorityQueue.addAll(incoming);

        while (!priorityQueue.isEmpty() && !availableDrivers.isEmpty()) {
            RideRequest request = priorityQueue.remove();
            Driver driver = availableDrivers.iterator().next();
            availableDrivers.remove(driver);
            System.out.println("Assigned " + driver.name + " to " + request.destination);
        }
    }

    private static final class RideRequest {
        private final String id;
        private final String destination;
        private final int priority;

        private RideRequest(String id, String destination, int priority) {
            this.id = id;
            this.destination = destination;
            this.priority = priority;
        }
    }

    private static final class Driver {
        private final String id;
        private final String name;

        private Driver(String id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}
