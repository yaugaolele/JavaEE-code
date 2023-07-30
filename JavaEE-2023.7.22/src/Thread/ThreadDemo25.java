package Thread;
//基于数组实现队列
class MyBlockingQueue{
    private int[] items = new int[1000];
    //约定在[head,tail)为队列的有效元素
    volatile private int head = 0;
    volatile private int tail = 0;
    volatile private int size = 0;

    //入队列
    synchronized public void put(int elem) throws InterruptedException {
        while (size == items.length) {
            //队列已满
            // return;
            this.wait();
        }
        //把新元素放到tail所在的位置上
        items[tail] = elem;
        tail++;
        //万一tail达到了上限，就需要让tail从头开始
        if (tail == items.length){
            tail = 0;
        }
        //tail = tail % items.length
        size++;
        this.notify();
    }

    //出队列
    synchronized public Integer take() throws InterruptedException {
        while (size == 0){
//            return null;
            this.wait();
        }
        int value = items[head];
        head++;
        if (head == items.length) {
            head = 0;
        }
        size--;
        this.notify();
        return value;
    }
}
public class ThreadDemo25 {
    public static void main(String[] args) {
        MyBlockingQueue queue = new MyBlockingQueue();
        //消费者
        Thread t1 = new Thread(() -> {
            while (true) {
                try {
                    int value = queue.take();
                    System.out.println("消费：" + value);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //生产者
        Thread t2 = new Thread(() -> {
            int value = 0;
            while (true) {
                try {
                    System.out.println("生产：" + value);
                    queue.put(value);
                    value++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        System.out.println("hello");
    }
}
