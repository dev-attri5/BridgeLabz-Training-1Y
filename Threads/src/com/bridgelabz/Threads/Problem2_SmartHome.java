package com.bridgelabz.Threads;

class Device implements Runnable {
    private String name;
    private int interval;

    public Device(String name, int interval) {
        this.name = name;
        this.interval = interval;
    }

    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println(name + " running cycle " + i);
            try { Thread.sleep(interval); } catch(Exception e){}
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Device("Security Camera",3000));
        Thread t2 = new Thread(new Device("Temperature Sensor",5000));
        Thread t3 = new Thread(new Device("Light Controller",4000));
        Thread t4 = new Thread(new Device("Door Lock",6000));

        t1.setPriority(10);
        t2.setPriority(7);
        t3.setPriority(5);
        t4.setPriority(5);

        t1.start(); t2.start(); t3.start(); t4.start();
    }
}
