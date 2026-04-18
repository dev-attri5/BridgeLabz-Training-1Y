package com.Bridgelabz.collection;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class InsurancePolicyManagementSystem {
    public static void main(String[] args) {
        List<Policy> input = List.of(
                new Policy("P1001", "Aarav Sharma", LocalDate.now().plusDays(12), "Health", 12000),
                new Policy("P1002", "Diya Patel", LocalDate.now().plusDays(45), "Auto", 18500),
                new Policy("P1003", "Kabir Singh", LocalDate.now().plusDays(5), "Home", 21000),
                new Policy("P1004", "Meera Nair", LocalDate.now().plusDays(27), "Health", 16000),
                new Policy("P1002", "Duplicate Auto", LocalDate.now().plusDays(60), "Auto", 20000)
        );

        PolicyStore store = new PolicyStore();
        input.forEach(store::addPolicy);

        System.out.println("All unique policies:");
        store.hashPolicies.forEach(System.out::println);

        System.out.println();
        System.out.println("Insertion order:");
        store.insertionPolicies.forEach(System.out::println);

        System.out.println();
        System.out.println("Sorted by expiry:");
        store.sortedPolicies.forEach(System.out::println);

        System.out.println();
        System.out.println("Expiring within 30 days:");
        store.getPoliciesExpiringSoon(30).forEach(System.out::println);

        System.out.println();
        System.out.println("Health policies:");
        store.getPoliciesByCoverageType("Health").forEach(System.out::println);

        System.out.println();
        System.out.println("Duplicate policy numbers: " + store.duplicateNumbers);

        System.out.println();
        store.comparePerformance();
    }

    private static final class PolicyStore {
        private final Set<Policy> hashPolicies = new HashSet<>();
        private final Set<Policy> insertionPolicies = new LinkedHashSet<>();
        private final Set<Policy> sortedPolicies = new TreeSet<>(
                Comparator.comparing(Policy::getExpiryDate).thenComparing(Policy::getPolicyNumber)
        );
        private final Set<String> seenNumbers = new HashSet<>();
        private final Set<String> duplicateNumbers = new LinkedHashSet<>();

        private void addPolicy(Policy policy) {
            if (!seenNumbers.add(policy.getPolicyNumber())) {
                duplicateNumbers.add(policy.getPolicyNumber());
                return;
            }

            hashPolicies.add(policy);
            insertionPolicies.add(policy);
            sortedPolicies.add(policy);
        }

        private List<Policy> getPoliciesExpiringSoon(int days) {
            List<Policy> result = new ArrayList<>();
            LocalDate today = LocalDate.now();

            for (Policy policy : sortedPolicies) {
                long remaining = ChronoUnit.DAYS.between(today, policy.getExpiryDate());
                if (remaining >= 0 && remaining <= days) {
                    result.add(policy);
                }
            }
            return result;
        }

        private List<Policy> getPoliciesByCoverageType(String type) {
            List<Policy> result = new ArrayList<>();
            for (Policy policy : insertionPolicies) {
                if (policy.getCoverageType().equalsIgnoreCase(type)) {
                    result.add(policy);
                }
            }
            return result;
        }

        private void comparePerformance() {
            List<Policy> sample = new ArrayList<>();
            for (int index = 1; index <= 1000; index++) {
                sample.add(new Policy(
                        "PX" + index,
                        "Holder " + index,
                        LocalDate.now().plusDays(index % 90 + 1),
                        index % 2 == 0 ? "Health" : "Auto",
                        5000 + index
                ));
            }

            measure("HashSet", new HashSet<>(), sample);
            measure("LinkedHashSet", new LinkedHashSet<>(), sample);
            measure("TreeSet", new TreeSet<>(Comparator.comparing(Policy::getExpiryDate).thenComparing(Policy::getPolicyNumber)), sample);
        }

        private void measure(String name, Set<Policy> set, List<Policy> sample) {
            long addStart = System.nanoTime();
            set.addAll(sample);
            long addEnd = System.nanoTime();

            Policy target = sample.get(sample.size() / 2);

            long searchStart = System.nanoTime();
            set.contains(target);
            long searchEnd = System.nanoTime();

            long removeStart = System.nanoTime();
            set.remove(target);
            long removeEnd = System.nanoTime();

            System.out.println(name + " -> add: " + (addEnd - addStart)
                    + ", search: " + (searchEnd - searchStart)
                    + ", remove: " + (removeEnd - removeStart));
        }
    }

    private static final class Policy {
        private final String policyNumber;
        private final String holderName;
        private final LocalDate expiryDate;
        private final String coverageType;
        private final double premiumAmount;

        private Policy(String policyNumber, String holderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
            this.policyNumber = policyNumber;
            this.holderName = holderName;
            this.expiryDate = expiryDate;
            this.coverageType = coverageType;
            this.premiumAmount = premiumAmount;
        }

        private String getPolicyNumber() {
            return policyNumber;
        }

        private LocalDate getExpiryDate() {
            return expiryDate;
        }

        private String getCoverageType() {
            return coverageType;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Policy other)) {
                return false;
            }
            return Objects.equals(policyNumber, other.policyNumber);
        }

        @Override
        public int hashCode() {
            return Objects.hash(policyNumber);
        }

        @Override
        public String toString() {
            return policyNumber + " | " + holderName + " | " + expiryDate + " | " + coverageType + " | premium=" + premiumAmount;
        }
    }
}
