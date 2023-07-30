package Thread;
//状态的获取
public class ThreadDemo11 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while (true) {
                //为了防止hello把线程状态冲没了，先注释掉
                //System.out.println("hello t");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //在启动之前，获取线程状态NEW
        System.out.println(t.getState());
        t.start();
        Thread.sleep(2000);
        System.out.println(t.getState());
    }
}
