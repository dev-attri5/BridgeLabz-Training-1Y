package com.bridgelabz.wrapper;

import java.util.ArrayList;
import java.util.List;

public class Scenario05SensorDataLogger {
    public static void main(String[] args) {
        ArrayList<Double> readings = new ArrayList<>();
        logReading(readings, 22.4);
        logReading(readings, Double.valueOf(23.1));
        logReading(readings, 21.8);

        double total = 0.0;
        for (Double reading : readings) {
            total += reading;
        }

        System.out.println("Stored sensor readings: " + readings);
        System.out.println("Average reading: " + (total / readings.size()));
    }

    public static void logReading(List<Double> readings, double primitiveReading) {
        readings.add(primitiveReading);
    }

    public static void logReading(List<Double> readings, Double wrapperReading) {
        if (wrapperReading != null) {
            readings.add(wrapperReading);
        }
    }
}
