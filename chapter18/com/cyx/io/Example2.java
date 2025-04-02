/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-02 02:55:20
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-02 09:23:27
 * @FilePath: /workspace/STUDY/chapter18/com/cyx/io/Example2.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter18.com.cyx.io;

/**
 * 使用字节输入流将文件信息从磁盘中读取到内存中来，并在控制台输出
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Example2 {
    public static void main(String[] args) {
        try{
            //根据提供的文件路径构建一条文件输入通道
            InputStream is = new FileInputStream("F:\\aa\\io.txt");
            int length = is.available();//获取通道中的数据长度
            //根据通道中数据的长度构建字节数组
            byte[] buffer = new byte[length];
            // int index = 0;
            // while(true){
            //     //读取通道中的数据，一次读取一个字节。如果读取到末尾，则返回-1
            //     byte b = (byte) is.read();
            //     if(b == -1) break;
            //     buffer[index++] = b;
            // }

            int readCount = is.read(buffer);//将通道中的数据全部读取到buffer数组中
            System.out.println("读取了" + readCount + "个字节");
            System.out.println(new String(buffer));
            is.close();//关闭通道
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
