package Time;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

//自己实现的线程池
class MyThreadPool{
    //阻塞队列用来存放任务
    private BlockingDeque<Runnable> queue = new LinkedBlockingDeque<>();
    public void submit(Runnable runnable) throws InterruptedException {
        queue.put(runnable);
    }

    //此处实现一个固定线程数的线程池
    public MyThreadPool(int n) {
        for (int i = 0; i < n; i++) {
            Thread t = new Thread(() -> {
                try {
                    while (true) {
                        //此处需要让线程池内部有一个while循环，不停的取任务
                        Runnable runnable = queue.take();
                        runnable.run();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            t.start();
        }
    }
}
public class ThreadDemo4 {
    public static void main(String[] args) throws InterruptedException {
        MyThreadPool pool = new MyThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            int number = i;
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("hello " + number);
                }
            });
//            Thread.sleep(1000);
        }
    }
}
