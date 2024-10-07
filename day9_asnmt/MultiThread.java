package day9_asnmt;

import day9.Counter;

public class MultiThread {
    public static void main(String[] args) {
        Counter c = new Counter();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(c){
                while(c.getCount() < c.getGreetingLength()/2){
                    c.printArray();
                    c.increment();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }}
            }
        });
        thread.start();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(c){
                while(c.getCount() < c.getGreetingLength()){
                    c.printArray();
                    c.increment();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }}
                }
            }

        });
        thread1.start();
    }
}
