/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-02 03:11:35
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-02 10:00:34
 * @FilePath: /workspace/STUDY/chapter18/com/cyx/io/Example3.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter18.com.cyx.io._byte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Example3 {
    
    public static void main(String[] args) {
        try{
            InputStream is = new FileInputStream("STUDY/F/aa/io.txt");
            //实际开发过程中字节数组的长度一般定义为1024的整数倍
            byte[] buffer = new byte[31];//构建了一个人长度为31的字节数组
            while(true){
                //从通道中读取数据存入字节数组buffer中，返回值就是读取的字节长度
                //如果读取到数据的末尾，则返回-1
                int len = is.read(buffer);
                if(len == -1) break;
                System.out.println(len);
                System.out.println(new String(buffer));
            }
            is.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
