package Thread;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class ThreadDemo24 {
    public static void main(String[] args) {
        BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();
        //消费者
        Thread t1 = new Thread(() -> {
            while (true) {
                int value = 0;
                try {
                    value = blockingDeque.take();
                    System.out.println("消费元素：" + value);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();

        //生产者
        Thread t2 = new Thread(() -> {
            int value = 0;
            while (true) {
                try {
                    System.out.println("生产元素：" + value);
                    blockingDeque.put(value);
                    value++;
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();

        //上述代码是让生产者每隔1s生产一个元素。
        //让消费者直接消费，不受限制
    }
}
