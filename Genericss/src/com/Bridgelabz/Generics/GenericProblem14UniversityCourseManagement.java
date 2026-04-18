package com.Bridgelabz.Generics;

import java.util.List;

public class GenericProblem14UniversityCourseManagement {
    public static void main(String[] args) {
        Course<ExamCourse> javaCourse = new Course<>("Advanced Java", new ExamCourse("Written Exam"));
        Course<AssignmentCourse> uiCourse = new Course<>("UI Engineering", new AssignmentCourse("Weekly Assignments"));
        Course<ResearchCourse> aiCourse = new Course<>("Applied AI", new ResearchCourse("Research Paper"));

        List<Course<? extends CourseType>> courses = List.of(javaCourse, uiCourse, aiCourse);
        displayCourses(courses);
    }

    private static void displayCourses(List<? extends Course<? extends CourseType>> courses) {
        for (Course<? extends CourseType> course : courses) {
            System.out.println(course);
        }
    }

    private abstract static class CourseType {
        private final String evaluation;

        CourseType(String evaluation) {
            this.evaluation = evaluation;
        }

        String evaluation() {
            return evaluation;
        }
    }

    private static final class ExamCourse extends CourseType {
        ExamCourse(String evaluation) {
            super(evaluation);
        }
    }

    private static final class AssignmentCourse extends CourseType {
        AssignmentCourse(String evaluation) {
            super(evaluation);
        }
    }

    private static final class ResearchCourse extends CourseType {
        ResearchCourse(String evaluation) {
            super(evaluation);
        }
    }

    private static final class Course<T extends CourseType> {
        private final String name;
        private final T type;

        Course(String name, T type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public String toString() {
            return name + " -> " + type.evaluation();
        }
    }
}
