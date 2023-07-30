package Time;

import java.util.Timer;
import java.util.TimerTask;

public class ThreadDemo1 {
    public static void main(String[] args) {
        //创建一个定时器
        Timer timer = new Timer();
        //让hello4、hello3、hello2、hello1在线程启动之后分别在4s、3s、2s、1s之后执行。
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("hello4");
            }
        },4000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("hello3");
            }
        },3000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("hello2");
            }
        },2000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("hello1");
            }
        },1000);
        System.out.println("hello0");
    }
}
