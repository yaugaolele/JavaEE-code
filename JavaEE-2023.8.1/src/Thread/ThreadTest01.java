package Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest01 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        //相当于是 i++
        atomicInteger.getAndIncrement();

    }
}
