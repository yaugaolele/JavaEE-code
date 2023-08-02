package io;

import java.io.File;
import java.util.Arrays;

public class IODemo4 {
    public static void main(String[] args) {
        File file = new File("test-dir");
        //返回File对象代表的目录下的所有文件名
        String[] results = file.list();
        System.out.println(Arrays.toString(results));
        //返回File对象代表的目录下的所有文件，以File对象表示
        File[] results2 = file.listFiles();
        System.out.println(Arrays.toString(results2));
    }
}
