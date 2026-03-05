package Threads.Deadlock;

public class DeadlockExample {
    public static void main(String[] args) {
        Object lock1=new Object();
        Object lock2=new Object();

        Thread t1=new Thread(()->{
            synchronized (lock1) {
                System.out.println("Thread 1 locked lock 1");

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                synchronized (lock2) {
                    System.out.println("Thread 1 is waiting for lock 2");
                }
            }
        });

        Thread t2=new Thread(()->{
            synchronized (lock2) {
                System.out.println("Thread 2 locked lock 2");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                synchronized (lock1) {
                    System.out.println("Thread 2 is waiting for lock 1");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
