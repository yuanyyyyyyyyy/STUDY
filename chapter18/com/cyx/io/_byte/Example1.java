/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-31 07:25:40
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-02 02:41:41
 * @FilePath: /workspace/STUDY/chapter18/com/cyx/io/Example1.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter18.com.cyx.io._byte;

/**
 * 使用文件输出流将“超用心在线教育”写入磁盘文件中
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class Example1 {

    /**
     * 增强for循环语法:
     * for(数据类型 变量名：遍历的数组)
     */

    public static void main(String[] args) {
        //将内容写入文件时，需要保证这个文件的父级目录一定存在，否则将报文件未找到异常
        try{
            File dir = new File("upload:\\aa");
            if(!dir.exists()) dir.mkdirs();
            File file = new File(dir,"io.txt");
            //构建磁盘文件与内存之间的通道
            OutputStream os = new FileOutputStream(file, true);
            String text = "超用心在线教育";
            byte[] bytes = text.getBytes();
            // for(byte b: bytes){
            //     os.write(b);//一次向通道中写一个字节至文件中
            // }
            // os.write(bytes);//向通道中一次将所有字节数组中的内容全部发送至文件中
            //os.write(bytes,0,bytes.length);//向通道中一次将所有字节数组中的内容全部发送至文件中
            
            //使用偏移量和长度的时候需要考虑数字下标越界
            os.write(bytes, 3, bytes.length - 3);
            //在通道关闭之前使用，强制将通道中的数据写入文件中
            os.flush();
            os.close();//关闭通道
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
