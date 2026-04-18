package com.Bridgelabz.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Scenario08WarehouseDeliveryTracking {
    public static void main(String[] args) {
        Set<String> packageIds = new HashSet<>();
        Queue<PackageItem> pending = new LinkedList<>();
        List<PackageItem> delivered = new ArrayList<>();
        Stack<PackageItem> returned = new Stack<>();

        addPackage(packageIds, pending, new PackageItem("PK1", "Mumbai"));
        addPackage(packageIds, pending, new PackageItem("PK2", "Delhi"));
        addPackage(packageIds, pending, new PackageItem("PK1", "Duplicate"));

        while (!pending.isEmpty()) {
            PackageItem item = pending.remove();
            if ("PK2".equals(item.id)) {
                returned.push(item);
            } else {
                delivered.add(item);
            }
        }

        System.out.println("Delivered: " + delivered);
        System.out.println("Returned: " + returned);
    }

    private static void addPackage(Set<String> ids, Queue<PackageItem> pending, PackageItem item) {
        if (ids.add(item.id)) {
            pending.add(item);
        }
    }

    private static final class PackageItem {
        private final String id;
        private final String destination;

        private PackageItem(String id, String destination) {
            this.id = id;
            this.destination = destination;
        }

        @Override
        public String toString() {
            return id + "->" + destination;
        }
    }
}
