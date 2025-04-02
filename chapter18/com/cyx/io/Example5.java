package chapter18.com.cyx.io;

/**
 * 使用字节流实现磁盘文件拷贝功能
 */
import java.io.*;

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
            if(is != null){
                try{
                    is.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }

            if(os != null){
                try{
                    os.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }

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
