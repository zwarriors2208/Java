package day9;
import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Queue;
public class MyQ {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity;

    public MyQ(int capacity){ this.capacity = capacity; }
    public synchronized void setValue(int x){
        while(queue.size() == capacity){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.add(x);
        notifyAll();
        System.out.println("Set value: "+x);
    }

    public synchronized void getValue(){
        while(queue.isEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int value = queue.remove();
        notifyAll();
        System.out.println("Get value: "+value);
    }

}
