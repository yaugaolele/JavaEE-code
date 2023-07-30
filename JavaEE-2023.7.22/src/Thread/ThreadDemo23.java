package Thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class ThreadDemo23 {
    public static void main(String[] args) throws InterruptedException {
        //这里的BlockingDeque是一个接口所以在实例化的时候我们使用的是以下两种形式
        //可以是数组形式的
//        BlockingDeque<String> queue = new ArrayBlockingQueue<>();
        //也可以使用的是链的形式
        BlockingDeque<String> queue = new LinkedBlockingDeque<>();
        //阻塞队列的核心方法，主要有两个
        //1.put入队列
        //第一次put操作
        queue.put("hello1");
        //第二次put操作
        queue.put("hello2");
        //第三次put操作
        queue.put("hello3");
        //第四次put操作
        queue.put("hello4");
        //第五次put操作
        queue.put("hello5");

        //2.take出队列
        String result = null;
        //第一次take操作
        result = queue.take();
        System.out.println(result);
        //第二次take操作
        result = queue.take();
        System.out.println(result);
        //第三次take操作
        result = queue.take();
        System.out.println(result);
        //第四次take操作
        result = queue.take();
        System.out.println(result);
        //第五次take操作
        result = queue.take();
        System.out.println(result);
        //第六次take操作
        result = queue.take();
        System.out.println(result);
    }
}
