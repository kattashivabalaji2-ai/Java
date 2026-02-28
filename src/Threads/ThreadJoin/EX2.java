package Threads.ThreadJoin;
class MyTask implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Child:" + i);
        }
    }
}
public class EX2 {
    public static void main(String[] args)throws InterruptedException {
        MyTask obj=new MyTask();
        Thread t1 = new Thread(obj);
        t1.start();
        t1.join();
        System.out.println("Main Thread Finished");
    }
}
