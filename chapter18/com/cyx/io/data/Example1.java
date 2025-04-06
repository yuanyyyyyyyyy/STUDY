/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-06 08:44:56
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-06 09:14:37
 * @FilePath: /workspace/STUDY/chapter18/com/cyx/io/data/Example1.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter18.com.cyx.io.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class Example1 {

    public static void main(String[] args) {
        writeData();
        readData();
    }

    private static void writeData(){
        String path = "STUDY/F/data/io.txt";
        File file = new File(path);
        File parent = file.getParentFile();
        if(!parent.exists()) parent.mkdirs();
        try(OutputStream os = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(os)){
            dos.writeByte(-1);
            dos.writeShort(-2);
            dos.writeInt(1);
            dos.writeLong(100);
            dos.writeFloat(1.0f);
            dos.writeDouble(100.0);
            dos.writeChar('a');
            dos.writeBoolean(true);
            dos.writeUTF("这是UTF-8编码格式的字符串");
            
            dos.flush();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void readData(){
        String path = "STUDY/F/data/io.txt";
        try(InputStream is = new FileInputStream(path);
            DataInputStream dis = new DataInputStream(is)){
            byte b = dis.readByte();
            System.out.println("读取字节：" + b);
            short s = dis.readShort();
            System.out.println("读取短整数：" + s);
            int i =dis.readInt();
            System.out.println("读取整数：" + i);
            long l = dis.readLong();
            System.out.println("读取长整数：" + l);
            float f =dis.readFloat();
            System.out.println("读取单精度浮点数：" + f);
            double d = dis.readDouble();
            System.out.println("读取双精度浮点型：" + d);
            char c = dis.readChar();
            System.out.println("读取字符：" + c);
            boolean bool = dis.readBoolean();
            System.out.println("读取布尔值：" + bool);
            String str = dis.readUTF();
            System.out.println("读取字符串：" + str);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(EOFException e){//EndOfFile
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
