package com.bridgelabz.Threads;

class Order implements Runnable {
    private String id;
    private int time;

    public Order(String id, int time) {
        this.id = id;
        this.time = time;
    }

    public void run() {
        System.out.println(id + " Picked up");
        try { Thread.sleep(time * 1000); } catch(Exception e){}
        System.out.println(id + " Delivered");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Order("Order1",2));
        Thread t2 = new Thread(new Order("Order2",4));
        Thread t3 = new Thread(new Order("Order3",3));
        Thread t4 = new Thread(new Order("Order4",5));
        Thread t5 = new Thread(new Order("Order5",1));

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(3);
        t4.setPriority(5);
        t5.setPriority(10);

        t1.start(); t2.start(); t3.start(); t4.start(); t5.start();
    }
}
