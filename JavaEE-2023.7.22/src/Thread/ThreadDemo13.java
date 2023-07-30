package Thread;
//synchronized加锁机制
class Counter1{
    private int count = 0;
    private Object locker = new Object();
    public void add() {
        synchronized (locker) {
            count++;
        }
    }
    public void sub() {
        count++;
    }
    public int get() {
        return count;
    }
}
public class ThreadDemo13 {
    public static void main(String[] args) throws InterruptedException {
        Counter1 counter = new Counter1();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                counter.add();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                counter.add();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter.get());
    }
}
