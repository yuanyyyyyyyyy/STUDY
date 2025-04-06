/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-05 13:30:44
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-05 13:38:28
 * @FilePath: /workspace/STUDY/chapter18/com/cyx/io/buffer/Example2.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter18.com.cyx.io.buffer;

/**
 * 使用缓冲字符流实现磁盘文件拷贝功能
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Example2 {

    public static void main(String[] args) {
        String sourceFile = "STUDY/F/aa/io.txt";
        String destFile = "STUDY/F/File/a.txt";
        copyFile(sourceFile, destFile);
    }

    public static void copyFile(String sourceFile, String destFile){
        File file = new File(destFile);
        File parent = file.getParentFile();
        if(!parent.exists()) parent.mkdirs();

        try(Reader reader = new FileReader(sourceFile);
            BufferedReader br = new BufferedReader(reader);
            Writer writer = new FileWriter(destFile);
            BufferedWriter bw = new BufferedWriter(writer);){
                char[] buffer = new char[4096];
                while(true){
                    int len = br.read(buffer);
                    if(len == -1) break;
                    bw.write(buffer, 0, len);
                }
                bw.flush();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }catch(IOException e){
                e.printStackTrace();
            }
    }
}
