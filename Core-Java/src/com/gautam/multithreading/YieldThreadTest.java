package com.gautam.multithreading;

class YieldThread extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(" Child Thread: "+i);
            Thread.yield();
        }
    }
}
public class YieldThreadTest {
    public static void main(String[] args) {
        YieldThread thread = new YieldThread();
        thread.start();

        for(int i = 1; i <= 5; i++) {
            System.out.println(" Main Thread: "+i);
            Thread.yield();
        }
    }
}
