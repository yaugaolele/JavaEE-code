package Thread;

public class ThreadDemo20 {
    public static void main(String[] args) throws InterruptedException {
        Object locker = new Object();
        Thread t1 = new Thread(() -> {
            System.out.println("wait 之前");
            synchronized (locker) {
                try {
                    locker.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("wait 之后");
        });
        t1.start();

        Thread.sleep(1000);

        Thread t2 = new Thread(() -> {
            synchronized (locker) {
                System.out.println("notify 开始");
                locker.notify();
                System.out.println("notify 结束");
            }
        });
        t2.start();
    }
}
