package Threads.WaysofCreatingThreads.RunnableInterface.Ex2;


class MyTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("My Thread:" + i);
        }
    }
}

    public class Demo {
        public static void main(String[] args) {
            MyTask obj = new MyTask();
            Thread t1 = new Thread(obj);
            t1.start();

            for (int i = 0; i <= 5; i++) {
                System.out.println("MainThread:" + i);
            }
        }
    }



