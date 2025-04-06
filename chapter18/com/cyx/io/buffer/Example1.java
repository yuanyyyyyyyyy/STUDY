/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-05 13:20:59
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-05 13:29:30
 * @FilePath: /workspace/STUDY/chapter18/com/cyx/io/buffer/Example1.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter18.com.cyx.io.buffer;

/**
 * 使用缓冲字节流实现磁盘文件拷贝功能
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Example1 {

    public static void main(String[] args) {
        String sourceFile = "STUDY/F/aa/io.txt";
        String destFile = "STUDY/F/File/a.txt";
        copyFile(sourceFile, destFile);
    }

    public static void copyFile(String sourceFile, String destFile){
        File file = new File(destFile);
        File parent = file.getParentFile();
        if(!parent.exists()) parent.mkdirs();

        try(InputStream is = new FileInputStream(sourceFile);
            BufferedInputStream bis = new BufferedInputStream(is);
            OutputStream os = new FileOutputStream(destFile);
            BufferedOutputStream bos = new BufferedOutputStream(os);){
            byte[] buffer = new byte[4096];
            while(true){
                int len = bis.read(buffer);
                if(len == -1) break;
                bos.write(buffer, 0, len);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
