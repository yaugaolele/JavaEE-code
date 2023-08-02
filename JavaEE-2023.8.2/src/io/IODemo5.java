package io;

import java.io.File;

public class IODemo5 {
    public static void main(String[] args) {
        //重命名
        File src = new File("./test-dir");
        File dest = new File("./test222");
        src.renameTo(dest);
    }
}
