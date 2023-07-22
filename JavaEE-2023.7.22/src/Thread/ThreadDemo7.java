package Thread;

public class ThreadDemo7 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
//            System.out.println("hello t");
        },"我的线程");
        t.start();
        System.out.println("线程ID是：" + t.getId());
        System.out.println("线程名称是：" + t.getName());
        System.out.println("线程状态是：" + t.getState());
        System.out.println("线程优先级是：" + t.getPriority());
        System.out.println("线程是否是后台线程：" + t.isDaemon());
        System.out.println("线程是否存活：" + t.isAlive());
        System.out.println("线程是否被中断：" + t.isInterrupted());
    }
}
