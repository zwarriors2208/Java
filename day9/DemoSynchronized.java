package day9;

import com.sun.source.tree.SynchronizedTree;

public class DemoSynchronized {
    public static void main(String[] args){
        Counter c = new Counter();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (c){ //The `synchronized (c)` block ensures that the code within it is only executed by one thread at a time for the object `c`. - This prevents concurrent modifications to `c`'s `count` variable, protecting against race conditions.
                for(int i=0;i<50;i++){
                    c.increment();
                    System.out.println(Thread.currentThread().getName()+" "+c.getCount());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
//                synchronized (c)
                {
                for(int i=0;i<50;i++){
                    c.increment();
                    System.out.println(Thread.currentThread().getName()+" "+c.getCount());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }}
        }).start();
    }
}
