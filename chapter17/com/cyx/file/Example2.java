package chapter17.com.cyx.file;

import java.io.File;
/**
 * 获取文件相关信息
 */
public class Example2 {

    public static void main(String[] args) {
        File file = new File("F:\\a\\b\\c.txt");
        //获取文件绝对路径
        String absPath = file.getAbsolutePath();
        System.out.println(absPath);// /workspace/F:\a\b\c.txt

        //获取文件的路径，可能是相对路径，也可能是绝对路径
        String path = file.getPath();
        System.out.println(path);// F:\a\b\c.txt

        //获取文件名
        String name = file.getName();
        System.out.println(name);// F:\a\b\c.txt

        //获取文件的父级文件夹对象
        // File parentFile = file.getParentFile();
        // System.out.println(parentFile.getPath());//出现异常

        //获取文件的父级路径
        String parentPath = file.getParent();
        System.out.println(parentPath);// null

        //获取文件的大小，单位是字节
        long length = file.length();
        System.out.println(length);// 0

        //获取文件的最后修改时间
        long lastUpdateTime = file.lastModified();
        System.out.println(lastUpdateTime);// 0

        //获取系统当前时间：单位毫秒
        long curentTime = System.currentTimeMillis();
        System.out.println(curentTime);// 1742381694663

        File file1 = new File("chapte17\\c.txt");
        System.out.println(file1.getAbsolutePath());// /workspace/chapte17\c.txt
        System.out.println(file1.getPath());// chapte17\c.txt
    }
}
