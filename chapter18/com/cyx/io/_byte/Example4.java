/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-02 10:00:58
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-02 10:05:38
 * @FilePath: /workspace/STUDY/chapter18/com/cyx/io/Example4.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter18.com.cyx.io._byte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Example4 {

    public static void main(String[] args) {
        try{
            InputStream is = new FileInputStream("STUDY/F/aa/io.txt");
            byte[] buffer = new byte[1024];
            int offset = 0;
            while(true){
                int len = is.read(buffer, offset, 40);
                if(len == -1) break;
                System.out.println(len);
                offset += len;
            }
            System.out.println(new String(buffer, 0, offset));
            is.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
