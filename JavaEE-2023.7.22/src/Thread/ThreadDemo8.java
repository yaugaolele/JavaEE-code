package Thread;
//使用结束标志位
public class ThreadDemo8 {
    public static boolean isQuit = false;
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while (!isQuit) {
                System.out.println("hello t");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("t 线程终止！！！");
        });
        t.start();
        //在主线程中修改isQuit
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isQuit = true;
    }
}
