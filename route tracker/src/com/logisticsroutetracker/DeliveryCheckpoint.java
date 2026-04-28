package com.logisticsroutetracker;

public class DeliveryCheckpoint extends Checkpoint {
    public DeliveryCheckpoint(String checkpointId, String locationName, double distanceFromLast,
                              int expectedDuration, int actualDuration) {
        super(checkpointId, locationName, distanceFromLast, expectedDuration, actualDuration);
    }

    @Override
    public boolean isCritical() {
        return true;
    }

    @Override
    public String getType() {
        return "Delivery";
    }

    @Override
    public double calculatePenalty() {
        return getDelayMinutes() * 2.0;
    }
}
