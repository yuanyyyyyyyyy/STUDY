package chapter18.com.cyx.io.buffer;
import java.io.*;

public class Example3 {
    //lineSeparator = \r\n
    public static void main(String[] args) {
        String sourceFile = "STUDY/F/buffer/io.txt";
        String destFile = "STUDY/F/copy/copy.txt";
        File file = new File(destFile);
        File parent = file.getParentFile();
        if(!parent.exists()) parent.mkdirs();

        try(Reader reader = new FileReader(sourceFile);
            BufferedReader br = new BufferedReader(reader);
            Writer writer = new FileWriter(destFile);
            BufferedWriter bw = new BufferedWriter(writer)){

            while(true){
                String line = br.readLine();//读行
                if(line == null) break;
                bw.write(line);//写行
                bw.newLine();//换行 => 相当于写入了一个\r\n
            }
            bw.flush();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    public static void copyFile(String sourceFile, String destFile){
        File file = new File(destFile);
        File parent = file.getParentFile();
        if(!parent.exists()) parent.mkdirs();
        try(Reader reader = new FileReader(sourceFile);
            BufferedReader br = new BufferedReader(reader);
            Writer writer = new FileWriter(destFile);
            BufferedWriter bw = new BufferedWriter(writer)){

            while(true){
                String line = br.readLine();//读行
                if(line == null) break;
                bw.write(line);//写行
                bw.newLine();//换行 => 相当于写入了一个\r\n
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void writeLine(){
        String path = "STUDY/F/buffer/io.txt";
        File file = new File(path);
        File parent = file.getParentFile();
        if(!parent.exists()) parent.mkdirs();
        try(Writer writer = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(writer)){
                bw.write("这是第1行");
                bw.newLine();
                bw.write("这是第2行");
                bw.newLine();
                bw.write("这是第3行");
                bw.newLine();
                bw.write("这是第4行");
                bw.newLine();

                bw.flush();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }catch(IOException e){
                e.printStackTrace();
            }
    }
    
}
