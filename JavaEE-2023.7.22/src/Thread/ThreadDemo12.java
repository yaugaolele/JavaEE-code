package Thread;
//线程不安全
class Counter{
    private int count = 0;
    public void sub() {
        count++;
    }
    public int get() {
        return count;
    }
}
public class ThreadDemo12 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        //搞两个线程，两个线程分别对这个counter自增5w次。
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                counter.sub();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                counter.sub();
            }
        });
        t1.start();
        t2.start();
        //等待两个线程执行结束，然后看结果。
        t1.join();
        t2.join();
        System.out.println(counter.get());
    }
}
