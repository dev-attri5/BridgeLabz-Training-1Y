package com.logisticsroutetracker;

public final class ConsolePrinter {
    private ConsolePrinter() {
    }

    public static void section(String title) {
        System.out.println();
        System.out.println("========== " + title + " ==========");
    }

    public static void heading(String title) {
        System.out.println();
        System.out.println("--- " + title + " ---");
    }
}
