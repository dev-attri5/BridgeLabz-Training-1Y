package com.Bridgelabz.Generics;

import java.util.List;

public class GenericProblem16ResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> engineerResume = new Resume<>("Asha", new SoftwareEngineer("Java, Spring, SQL"));
        Resume<DataScientist> dataResume = new Resume<>("Rahul", new DataScientist("Python, ML, Statistics"));
        Resume<ProductManager> pmResume = new Resume<>("Neha", new ProductManager("Roadmaps, Analytics, UX"));

        System.out.println(processResume(engineerResume));
        System.out.println(processResume(dataResume));
        System.out.println(processResume(pmResume));

        runPipeline(List.of(
                engineerResume.role(),
                dataResume.role(),
                pmResume.role()));
    }

    private static <T extends JobRole> String processResume(Resume<T> resume) {
        return "Processed " + resume.candidateName() + " for role " + resume.role().title();
    }

    private static void runPipeline(List<? extends JobRole> roles) {
        System.out.println("Screening pipeline:");
        for (JobRole role : roles) {
            System.out.println("- " + role.title() + " | focus: " + role.skills());
        }
    }

    private abstract static class JobRole {
        private final String title;
        private final String skills;

        JobRole(String title, String skills) {
            this.title = title;
            this.skills = skills;
        }

        String title() {
            return title;
        }

        String skills() {
            return skills;
        }
    }

    private static final class SoftwareEngineer extends JobRole {
        SoftwareEngineer(String skills) {
            super("Software Engineer", skills);
        }
    }

    private static final class DataScientist extends JobRole {
        DataScientist(String skills) {
            super("Data Scientist", skills);
        }
    }

    private static final class ProductManager extends JobRole {
        ProductManager(String skills) {
            super("Product Manager", skills);
        }
    }

    private static final class Resume<T extends JobRole> {
        private final String candidateName;
        private final T role;

        Resume(String candidateName, T role) {
            this.candidateName = candidateName;
            this.role = role;
        }

        String candidateName() {
            return candidateName;
        }

        T role() {
            return role;
        }
    }
}
