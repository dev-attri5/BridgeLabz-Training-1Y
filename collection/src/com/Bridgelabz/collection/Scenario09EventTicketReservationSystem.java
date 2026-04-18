package com.Bridgelabz.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Scenario09EventTicketReservationSystem {
    public static void main(String[] args) {
        Set<String> users = new HashSet<>();
        List<Booking> confirmed = new ArrayList<>();
        Queue<Booking> bookings = new LinkedList<>();
        PriorityQueue<Booking> vipBookings = new PriorityQueue<>((a, b) -> Integer.compare(b.priority, a.priority));

        users.add("U1");
        users.add("U2");
        users.add("U1");

        bookings.add(new Booking("U1", "Music Fest", 1));
        bookings.add(new Booking("U2", "Music Fest", 5));
        vipBookings.addAll(bookings);

        while (!vipBookings.isEmpty()) {
            confirmed.add(vipBookings.remove());
        }

        System.out.println("Users: " + users);
        System.out.println("Confirmed bookings: " + confirmed);
    }

    private static final class Booking {
        private final String userId;
        private final String eventName;
        private final int priority;

        private Booking(String userId, String eventName, int priority) {
            this.userId = userId;
            this.eventName = eventName;
            this.priority = priority;
        }

        @Override
        public String toString() {
            return userId + " - " + eventName + " (priority=" + priority + ")";
        }
    }
}
