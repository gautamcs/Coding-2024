package com.gautam.multithreading;

public class OverrideStart {
    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.start();
        System.out.println(" Main Thread !");

    }
}
