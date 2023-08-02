package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IODemo9 {
    public static void main(String[] args) throws IOException {
        try (OutputStream outputStream = new FileOutputStream("d:/Java学习代码记录/JavaGitee代码提交/java-ee-elementary/test.txt")) {
            outputStream.write(97);
            outputStream.write(98);
            outputStream.write(99);
        }
    }
}
