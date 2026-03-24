package com.bridgelabz.Threads;

class BankAccount implements Runnable {
    private String name;
    private int priority;

    public BankAccount(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " checking balance | Priority: " + Thread.currentThread().getPriority());
            try { Thread.sleep(2000); } catch (Exception e) {}
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new BankAccount("Premium User", 10));
        Thread t2 = new Thread(new BankAccount("Regular User", 5));
        Thread t3 = new Thread(new BankAccount("Basic User", 1));

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start(); t2.start(); t3.start();
    }
}
