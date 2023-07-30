package Time;

import java.util.PriorityQueue;
class MyTask implements Comparable<MyTask>{
    public Runnable runnable;
    //为了方便后续的判定，使用绝对的时间戳
    public long time;
    public MyTask(Runnable runnable, long delay) {
        this.runnable = runnable;
        //取当前时刻的时间戳 + delay，作为该任务实际执行的时间戳。
        this.time = System.currentTimeMillis() + delay;
    }

    //指定一下在后续的优先级队列中我们是要按照时间来进行比较大小
    @Override
    public int compareTo(MyTask o) {
        //这样的写法意味着每次取出的是时间最小的元素
        return (int) (this.time - o.time);
    }
}
//自己实现一个类似于Timer类的MyTimer
class MyTimer{
    //这个结构要求带有优先级的阻塞队列，核心数据结构就是“堆”。
    //PriorityQueue<> ———— <>里面的元素需要我们手动的封装一下，创建一个MyTask类，表示两方面的信息。1.执行的任务是啥。2.任务啥时候执行。
    private PriorityQueue<MyTask> queue = new PriorityQueue<>();

    //创建一个锁对象
    private Object locker = new Object();

    //此处的delay是一个形如3000这样的数字（指多长时间后执行该任务）
    public void schedule(Runnable runnable, long delay) {
        //根据参数，构造MyTask，插入队列即可。
        synchronized (locker) {
            synchronized (locker) {
                MyTask myTask = new MyTask(runnable, delay);
                queue.offer(myTask);
                locker.notify();
            }
        }
    }

    //在这里构造线程，负责执行具体的任务
    public MyTimer() {
        Thread t = new Thread(() -> {
            while (true) {
                try {
                    synchronized (locker) {
                        //阻塞队列，只有阻塞的入队列和阻塞的出队列，没有阻塞的查看队首元素。
                        while (queue.isEmpty()) {
                            locker.wait();
                        }
                        MyTask myTask = queue.peek();
                        long curTime = System.currentTimeMillis();
                        if (curTime >= myTask.time) {
                            //时间到了，可以执行任务了
                            queue.poll();
                            myTask.runnable.run();
                        } else {
                            //时间还没到
                            locker.wait(myTask.time - curTime);
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //启动线程
        t.start();
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        //创建一个定时器对象
        MyTimer myTimer = new MyTimer();
        //模仿之前的使用方式使用
        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello4");
            }
        }, 4000);
        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello3");
            }
        }, 3000);
        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello2");
            }
        }, 2000);
        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello1");
            }
        }, 1000);
        System.out.println("hello0");
    }
}
