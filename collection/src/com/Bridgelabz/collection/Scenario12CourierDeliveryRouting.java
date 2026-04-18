package com.Bridgelabz.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Scenario12CourierDeliveryRouting {
    public static void main(String[] args) {
        PriorityQueue<Parcel> priorityParcels = new PriorityQueue<>((a, b) -> Integer.compare(b.priority, a.priority));
        Queue<Parcel> normalParcels = new LinkedList<>();
        Set<String> ids = new HashSet<>();
        List<Parcel> completed = new ArrayList<>();

        addParcel(priorityParcels, normalParcels, ids, new Parcel("D1", "North Route", 5));
        addParcel(priorityParcels, normalParcels, ids, new Parcel("D2", "West Route", 2));
        addParcel(priorityParcels, normalParcels, ids, new Parcel("D1", "Duplicate", 4));

        while (!priorityParcels.isEmpty()) {
            completed.add(priorityParcels.remove());
        }
        while (!normalParcels.isEmpty()) {
            completed.add(normalParcels.remove());
        }

        System.out.println("Completed deliveries: " + completed);
    }

    private static void addParcel(PriorityQueue<Parcel> priorityParcels, Queue<Parcel> normalParcels, Set<String> ids, Parcel parcel) {
        if (ids.add(parcel.id)) {
            if (parcel.priority >= 4) {
                priorityParcels.add(parcel);
            } else {
                normalParcels.add(parcel);
            }
        }
    }

    private static final class Parcel {
        private final String id;
        private final String route;
        private final int priority;

        private Parcel(String id, String route, int priority) {
            this.id = id;
            this.route = route;
            this.priority = priority;
        }

        @Override
        public String toString() {
            return id + " (" + route + ", priority=" + priority + ")";
        }
    }
}
