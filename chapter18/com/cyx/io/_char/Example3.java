package chapter18.com.cyx.io._char;

/**
 * 使用字符流实现磁盘文件拷贝功能
 */
import java.io.*;

public class Example3 {
    public static void main(String[] args) {
        String sourceFile = "STUDY/F/aa/io.txt";
        String destFile = "STUDY/F/File/a.txt";
        copyFile(sourceFile, destFile);
    }

    public static void copyFile(String sourceFile, String destFile){
        File file = new File(destFile);
        File parent = file.getParentFile();
        if(!parent.exists()) parent.mkdirs();
        try(Reader reader = new FileReader(sourceFile);
            Writer writer = new FileWriter(file)){
            char[] buffer = new char[4096];
            while(true){
                int len = reader.read(buffer);
                if(len == -1) break;
                writer.write(buffer, 0, len);
            }
            writer.flush();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }catch(IOException e){
                e.printStackTrace();
            }
    }
}
