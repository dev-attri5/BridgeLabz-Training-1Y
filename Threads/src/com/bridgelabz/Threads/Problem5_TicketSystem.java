package com.bridgelabz.Threads;

import java.util.Random;

class Ticket extends Thread {
    private String type;

    public Ticket(String type) {
        this.type = type;
    }

    public void run() {
        Random r = new Random();
        int time = (r.nextInt(5) + 1) * 1000;
        System.out.println(type + " started by " + Thread.currentThread().getName());
        try { Thread.sleep(time); } catch(Exception e){}
        System.out.println(type + " completed");
    }

    public static void main(String[] args) {
        String[] types = {"Critical Bug","Feature Request","General Query","Feedback"};

        for(int i=0;i<10;i++){
            Ticket t = new Ticket(types[i%4]);
            t.setPriority((i%4==0)?10:(i%4==1)?4:(i%4==2)?2:1);
            t.start();
        }
    }
}
