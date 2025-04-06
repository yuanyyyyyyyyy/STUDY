/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-02 10:07:10
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-02 11:02:24
 * @FilePath: /workspace/STUDY/chapter18/com/cyx/io/Example5.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter18.com.cyx.io._byte;

/**
 * 使用字节流实现磁盘文件拷贝功能
 */
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Example5 {

    public static void main(String[] args) {
        String sourceFile = "STUDY/chapter18/com/cyx/io/Example1.java";
        String destFile = "STUDY/F/aa/io.txt";
        copyFile(sourceFile, destFile);
    }

    public static void copyFile2(String sourceFile, String destFile){
        File file = new File(destFile);
        File parent = file.getParentFile();
        if(!parent.exists()) parent.mkdirs();
        //try(){}catch(){}  JDK 1.7
        //写在括号中的代码只能够是实现了AutoClosable接口的类
        //is os 调用结束后才会自动关闭
        try(InputStream is = new FileInputStream(sourceFile);
            OutputStream os = new FileOutputStream(destFile);){

                byte[] buffer = new byte[4096];
                while(true){
                    int len = is.read(buffer);
                    if(len == -1) break;
                    os.write(buffer, 0, len);
                }
                os.flush();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }catch(IOException e){
                e.printStackTrace();
            }
    }

    public static void copyFile(String sourceFile, String destFile){
        File file = new File(destFile);
        File parent = file.getParentFile();
        if(!parent.exists()){
            parent.mkdirs();
        }
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream(sourceFile);
            os = new FileOutputStream(destFile);
            byte[] buffer = new byte[4096];
            while(true){
                int len = is.read(buffer);
                if(len == -1) break;
                os.write(buffer, 0, len);
            }
            os.flush();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            // if(is != null){
            //     try{
            //         is.close();
            //     }catch(IOException e){
            //         e.printStackTrace();
            //     }
            // }

            // if(os != null){
            //     try{
            //         os.close();
            //     }catch(IOException e){
            //         e.printStackTrace();
            //     }
            // }

            close(is, os);
        }
    }

    //不定义自变量，本质是一个数组。在使用不定长自变量作为方法的参数时，必须是该方法参数列表的最后一个参数
    public static void close(Closeable... closeables){
        for(Closeable c: closeables){
            if(c!=null){
                try{
                    c.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
