package com.Bridgelabz.Generics;

import java.util.List;

public class GenericProblem15MealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMeal = new Meal<>(new VegetarianMeal("Paneer Bowl"));
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal("Grilled Chicken Salad"));

        System.out.println(generatePlan(vegetarianMeal));
        System.out.println(generatePlan(ketoMeal));

        validatePlans(List.of(vegetarianMeal.plan(), ketoMeal.plan(), new VeganMeal("Tofu Stir Fry")));
    }

    private static <T extends MealPlan> String generatePlan(Meal<T> meal) {
        return "Generated plan: " + meal.plan().name();
    }

    private static void validatePlans(List<? extends MealPlan> plans) {
        for (MealPlan plan : plans) {
            System.out.println("Validated meal plan: " + plan.name());
        }
    }

    private interface MealPlan {
        String name();
    }

    private record VegetarianMeal(String name) implements MealPlan { }

    private record VeganMeal(String name) implements MealPlan { }

    private record KetoMeal(String name) implements MealPlan { }

    private static final class Meal<T extends MealPlan> {
        private final T plan;

        Meal(T plan) {
            this.plan = plan;
        }

        T plan() {
            return plan;
        }
    }
}
