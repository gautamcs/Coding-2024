package com.gautam.multithreading;

public class MyThread {
    public void run() {
        System.out.println(" Child Thread!");
    }

    public void start() {
        // super.start();
        System.out.println(" Overridden Start method !!");
    }
}
