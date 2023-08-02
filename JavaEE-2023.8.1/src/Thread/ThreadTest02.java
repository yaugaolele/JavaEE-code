package Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger num = new AtomicInteger(0);
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                //实现自增
                num.getAndIncrement();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                //实现自增
                num.getAndIncrement();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        //get来获取到数值
        System.out.println(num.get());
    }
}
