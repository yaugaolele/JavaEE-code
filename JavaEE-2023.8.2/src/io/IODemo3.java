package io;

import java.io.File;

public class IODemo3 {
    public static void main(String[] args) {
        File file = new File("test-dir/aaa/bbb");
        //只创建一级目录
//        file.mkdir();
        //创建多级目录
        file.mkdirs();
    }
}
