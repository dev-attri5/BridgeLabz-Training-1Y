import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem02HospitalDoctorAvailability {
    static class Doctor {
        private final String name;
        private final String specialty;
        private final boolean availableOnWeekend;

        Doctor(String name, String specialty, boolean availableOnWeekend) {
            this.name = name;
            this.specialty = specialty;
            this.availableOnWeekend = availableOnWeekend;
        }

        public String getSpecialty() {
            return specialty;
        }

        public boolean isAvailableOnWeekend() {
            return availableOnWeekend;
        }

        @Override
        public String toString() {
            return name + " (" + specialty + ")";
        }
    }

    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Iyer", "Cardiology", true),
            new Doctor("Dr. Khan", "Neurology", false),
            new Doctor("Dr. Shah", "Dermatology", true),
            new Doctor("Dr. Mehta", "Orthopedics", true)
        );

        doctors.stream()
            .filter(Doctor::isAvailableOnWeekend)
            .sorted(Comparator.comparing(Doctor::getSpecialty))
            .forEach(System.out::println);
    }
}
