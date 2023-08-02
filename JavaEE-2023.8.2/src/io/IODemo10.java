package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IODemo10 {
    public static void main(String[] args) throws FileNotFoundException {
        try (Reader reader = new FileReader("d:/Java学习代码记录/JavaGitee代码提交/java-ee-elementary/test.txt")) {
            while (true) {
                int c = reader.read();
                if (c == -1) {
                    break;
                }
                char ch = (char)c;
                System.out.println(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
