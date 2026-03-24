package com.bridgelabz.Threads;

class ExamTask extends Thread {
    private String task;
    private int delay;

    public ExamTask(String task, int delay) {
        this.task = task;
        this.delay = delay;
    }

    public void run() {
        try {
            Thread.sleep(delay);
            System.out.println(task + " started");
        } catch(Exception e){}
    }

    public static void main(String[] args) {
        ExamTask entry = new ExamTask("Entry Monitoring",0);
        ExamTask paper = new ExamTask("Question Paper Distribution",5000);
        ExamTask attendance = new ExamTask("Attendance",10000);
        ExamTask collection = new ExamTask("Answer Sheet Collection",15000);

        entry.setPriority(5);
        paper.setPriority(10);
        attendance.setPriority(8);
        collection.setPriority(7);

        entry.start();
        paper.start();
        attendance.start();
        collection.start();
    }
}
