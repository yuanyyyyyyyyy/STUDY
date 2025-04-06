/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-05 12:22:44
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-05 12:28:14
 * @FilePath: /workspace/STUDY/chapter18/com/cyx/io/_char/Example2.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter18.com.cyx.io._char;

import java.io.FileNotFoundException;
/**
 * 使用字符流将文件信息从磁盘中读取到内存中，并在控制台输出
 */
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Example2 {

    public static void main(String[] args) {
        try(Reader reader = new FileReader("STUDY/F/aa/io.txt");){
            // StringBuilder builder = new StringBuilder();
            // while(true){
            //     int c = reader.read();
            //     if(c == -1) break;
            //     builder.append((char)c);
            // }
            // System.out.println(builder);

            char[] buffer = new char[4096];
            int offset = 0;
            while(true){
                //int len = reader.readd(buffer);
                int len = reader.read(buffer, offset, 30);
                if(len == -1) break;
                offset += len;
            }
            System.out.println(new String(buffer, 0, offset));

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
