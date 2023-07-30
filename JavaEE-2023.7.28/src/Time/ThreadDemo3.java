package Time;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//线程池的使用
public class ThreadDemo3 {
    public static void main(String[] args) {
        //创建一个线程池
        ExecutorService pool = Executors.newFixedThreadPool(10);
        //添加任务到线程池中
        pool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });
    }
}
