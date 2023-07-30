package Thread;

import java.util.Scanner;
import java.util.TreeMap;

public class ThreadDemo18 {
    volatile public static int flag = 0;
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (flag == 0) {
                //空着
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
            System.out.println("循环结束！t1结束！");
        });
        Thread t2 = new Thread(() ->{
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个整数：");
            flag = scanner.nextInt();
        });
        t1.start();
        t2.start();
    }
}
