package day9;

public class DemoThread {
    public static void main(String[] args) {
        Thread thread = new Thread1();
        thread.start();

        // using runnable
        Thread thread1 = new Thread(new Thread2());
        thread1.start();
        for (int i = 0;i<10;i++){
            System.out.println("Main Thread "+ i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();//This method prints:The name of the exception.; The description/message of the exception (if any).
//         The stack trace, which includes the file names, method names, and line numbers where the exception was thrown.
            }
        }
    }
}
