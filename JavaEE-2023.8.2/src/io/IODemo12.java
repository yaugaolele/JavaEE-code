package io;

import java.io.*;
import java.util.Scanner;

public class IODemo12 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        //1.先让用户指定一个要搜索的根目录
        System.out.println("请输入要扫描的根目录：");
        File rootDir = new File(scanner.next());
        if (!rootDir.isDirectory()){
            System.out.println("输入有误，您输入的目录不存在!");
            return;
        }
        //2.让用户输入一个要查找的词
        System.out.println("请输入要查找的词：");
        String word = scanner.next();

        //3.递归的进行目录/文件的遍历
        scanDir(rootDir,word);
    }

    private static void scanDir(File rootDir, String word) throws FileNotFoundException {
        //列出当前的rootDir中的内容，没有内容，直接递归结束
        File[] files = rootDir.listFiles();
        if (files == null) {
            //当前rootDir是一个空目录，这里啥都没有
            //没必要在进行递归了
            return;
        }
        //目录里有内容，就遍历目录中的每个元素
        for (File f : files) {
            System.out.println("当前搜索到的结果是：" + f.getAbsolutePath());
            if (f.isFile()) {
                //是普通文件
                //打开文件，读取内容，比较看是否包含上述的关键字
                String content = readFile(f);
                if (content.contains(word)){
                    System.out.println(f.getAbsolutePath() + "包含要查找的关键字!");
                }
            } else if (f.isDirectory()) {
                //是目录
                //进行递归操作
                scanDir(f,word);
            }else {
                //不是普通文件，也不是目录文件，直接跳过
                continue;
            }
        }
    }

    private static String readFile(File f) throws FileNotFoundException {
        //读取文件的整个内容，返回出来
        //使用字符流来读取，由于咱们匹配的是字符串，此处只能按照字符流处理，才是有意义的
        StringBuilder stringBuilder = new StringBuilder();
        try (Reader reader = new FileReader(f)) {
            //一次读取一个字符，把读到的结果给拼装到stringBuilder中，同一转换成String
            while (true) {
                int c = reader.read();
                if (c == -1){
                    break;
                }
                stringBuilder.append((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
