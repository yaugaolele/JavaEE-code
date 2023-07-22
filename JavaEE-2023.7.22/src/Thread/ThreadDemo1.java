package Thread;
//使用继承Thread，重写run方法来创建线程

class MyThread extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("hello t");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t = new MyThread();
        //start会创建新的线程。
        t.start();
        //run不会创建新的线程。run是在main线程中执行的。
        //t.run();
        while (true) {
            System.out.println("hello main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
