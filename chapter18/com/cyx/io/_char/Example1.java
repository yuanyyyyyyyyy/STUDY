/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-03 06:34:19
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-05 12:56:56
 * @FilePath: /workspace/STUDY/chapter18/com/cyx/io/_char/Examle1.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter18.com.cyx.io._char;

/**
 * 使用字符流将"超用心在线教育"写入磁盘文件中
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example1 {

    public static void main(String[] args) {
        File file = new File("STUDY/F/aa/io.txt");
        File parent = file.getParentFile();
        if(!parent.exists()) parent.mkdirs();
        //writer类实现了AutoCloseable接口，因此可以将writer类对象的构建方法try后面的()中
        try(Writer writer = new FileWriter(file, true);){
            String text = "超用心在线教育";
            // char[] valurs = text.toCharArray();
            // for(char c: valurs){
            //     writer.write(c);
            // }

            // writer.write(values);
            // writer.write(values, 1, valus.length-1);

            writer.write(text);
            writer.flush();//强制将通道中的数据写入文件
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
