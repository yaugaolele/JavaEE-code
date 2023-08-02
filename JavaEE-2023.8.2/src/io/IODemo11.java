package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IODemo11 {
    public static void main(String[] args) throws IOException {
        try (Writer writer = new FileWriter("d:/Java学习代码记录/JavaGitee代码提交/java-ee-elementary/test.txt")) {
            writer.write(65);
            writer.write(66);
            writer.write(67);
        }
    }
}
