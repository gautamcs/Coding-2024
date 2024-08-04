package com.gautam.multithreading;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        Thread thread1 = Thread.currentThread();

        //  Original Thread: Thread[main,5,main]
        System.out.println(" Original Thread: "+thread1.toString());
        thread1.setName("Child_Thread");

        // Exception in thread "Child_Thread" java.lang.IllegalArgumentException
        // thread1.setPriority(11);

        //  Modified Thread: Thread[Child_Thread,5,main]
        System.out.println(" Modified Thread: "+thread1);
    }
}
