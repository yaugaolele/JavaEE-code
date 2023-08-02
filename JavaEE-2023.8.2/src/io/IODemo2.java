package io;

import java.io.File;
import java.io.IOException;

public class IODemo2 {
    public static void main(String[] args) throws IOException {
        //在相对路径中，./通常可以省略
        File file = new File("./hello_world.txt");
        System.out.println("创建文件之前：");
        //判断File文件是否存在
        System.out.println(file.exists());
        //判断File对象代表的文件是否是一个目录
        System.out.println(file.isDirectory());
        //判断File对象代表的文件是是否是一个普通文件
        System.out.println(file.isFile());

        System.out.println("创建文件之后：");
        //创建文件
        file.createNewFile();
        //判断File文件是否存在
        System.out.println(file.exists());
        //判断File对象代表的文件是否是一个目录
        System.out.println(file.isDirectory());
        //判断File对象代表的文件是是否是一个普通文件
        System.out.println(file.isFile());

        //删除文件
        file.delete();
        System.out.println("删除文件之后：");
        System.out.println(file.exists());
    }
}
