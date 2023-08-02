package io;

import java.io.File;
import java.io.IOException;

public class IODemo1 {
    public static void main(String[] args) throws IOException {
        //就可以通过File对象进行操作了
        File file = new File("./cat.jpg");
        //返回File对象的父目录文件路径
        System.out.println(file.getParent());
        //返回File对象的纯文件名称
        System.out.println(file.getName());
        //返回File对象的文件路径
        System.out.println(file.getPath());
        //返回File对象的绝对路径
        System.out.println(file.getAbsolutePath());
        //返回File对象的修饰过的绝对路径
        System.out.println(file.getCanonicalPath());
    }
}
