package Threads.ThreadJoin;
class MyThread extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Child:"+i);
        }
    }
}
public class DEMO{
    public static void main(String[] args)throws InterruptedException {
        MyThread t1=new MyThread();
        t1.start();
        t1.join();
        System.out.println("Main Thread Finished");
    }
}

