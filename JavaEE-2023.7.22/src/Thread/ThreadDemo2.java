package Thread;
//使用Runnable接口来实现线程创建
//1.实现Runnable接口
class MyRunnable implements Runnable{
    @Override
    public void run() {
        while (true) {
            System.out.println("hello t");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        //2.创建爱你Thread类实例，调用Thread的构造方法是将Runnable对象作为target参数。
        MyRunnable runnable = new MyRunnable();
        Thread t = new Thread(runnable);
        //3.调用start方法。
        t.start();
        while (true) {
            System.out.println("hello main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
