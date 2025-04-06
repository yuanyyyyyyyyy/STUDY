/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-06 09:28:35
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-06 10:02:29
 * @FilePath: /workspace/STUDY/chapter18/com/cyx/io/object/Example1.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter18.com.cyx.io.object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class Example1 {

    public static void main(String[] args) {
        writeObject();
        readObject();
    }

    private static void writeObject(){
        String path = "STUDY/F/obj/stu.obj";
        File file = new File(path);
        File parent = file.getParentFile();
        if(!parent.exists()) parent.mkdirs();

        try(OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os)){
                oos.writeObject(new Student("张三", 20));
                oos.flush();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }catch(IOException e){
                e.printStackTrace();
            }
    }

    private static void readObject(){
        String path = "STUDY/F/obj/stu.obj";
        try(InputStream is = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(is)){
            Student s = (Student) ois.readObject();
            System.out.println(s);
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }catch(IOException e){
                e.printStackTrace();
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }
    }
}
