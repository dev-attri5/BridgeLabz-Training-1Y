public class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = 3.14159;

        double volumeKm3 = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;

        double radiusMiles = radiusKm * 0.621371;
        double volumeMiles3 = (4.0 / 3.0) * pi * radiusMiles * radiusMiles * radiusMiles;

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 +
                " and cubic miles is " + volumeMiles3);
    }
}
