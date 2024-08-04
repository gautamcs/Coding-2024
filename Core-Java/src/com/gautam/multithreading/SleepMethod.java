package com.gautam.multithreading;

class SleepThread implements  Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++ ) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(" Catch Block !");
            }
        }
    }
}
public class SleepMethod {
    public static void main(String[] args) {
        SleepThread t1 = new SleepThread();
        Thread thread = new Thread(t1);
        thread.start();
        thread.interrupt();
    }
}
