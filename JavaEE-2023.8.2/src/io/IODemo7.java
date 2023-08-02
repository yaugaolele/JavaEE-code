package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IODemo7 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("d:/Java学习代码记录/JavaGitee代码提交/java-ee-elementary/test.txt");
        } finally {
            inputStream.close();
        }
    }
}
