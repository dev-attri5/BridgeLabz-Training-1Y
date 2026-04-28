package com.logisticsroutetracker;

public abstract class Checkpoint {
    private final String checkpointId;
    private final String locationName;
    private final double distanceFromLast;
    private final int expectedDuration;
    private final int actualDuration;

    protected Checkpoint(String checkpointId, String locationName, double distanceFromLast,
                         int expectedDuration, int actualDuration) {
        this.checkpointId = checkpointId;
        this.locationName = locationName;
        this.distanceFromLast = distanceFromLast;
        this.expectedDuration = expectedDuration;
        this.actualDuration = actualDuration;
    }

    public String getCheckpointId() {
        return checkpointId;
    }

    public String getLocationName() {
        return locationName;
    }

    public double getDistanceFromLast() {
        return distanceFromLast;
    }

    public int getExpectedDuration() {
        return expectedDuration;
    }

    public int getActualDuration() {
        return actualDuration;
    }

    public int getDelayMinutes() {
        return Math.max(0, actualDuration - expectedDuration);
    }

    public boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    public abstract boolean isCritical();

    public abstract String getType();

    public abstract double calculatePenalty();

    public String getStatus() {
        return isDelayed() ? "Delayed" : "On Time";
    }
}
