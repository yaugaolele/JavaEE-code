package Thread;
class MyThread extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("hello run");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        while (true) {
            System.out.println("hello main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
