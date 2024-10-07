package day9;

public class MyQueue {
    int value;
    boolean hasValue = false;

    public synchronized void setValue(int value){
        if(hasValue){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.value = value;
        hasValue = true;
        notify();
        System.out.println("Set value: "+value);
    }


    public synchronized void getValue(){
        if(!hasValue){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hasValue = false;
        notify();
        System.out.println("Get value: "+value);
    }
}
