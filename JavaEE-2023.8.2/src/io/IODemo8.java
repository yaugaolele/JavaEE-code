package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IODemo8 {
    public static void main(String[] args) throws IOException {
        try (InputStream inputStream = new FileInputStream("d:/Java学习代码记录/JavaGitee代码提交/java-ee-elementary/test.txt")) {
            //读文件
            //read一次返回的是一个字节，但是此处的返回类型是int
            while (true) {
                int b = inputStream.read();
                if (b == -1) {
                    //读到末尾了，结束循环即可
                    break;
                }
                System.out.printf("%x\n",b);
            }
        }

    }
}
