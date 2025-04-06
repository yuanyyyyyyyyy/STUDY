package chapter18.com.cyx.io.buffer;
import java.io.*;

public class Example3 {
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
            bw.newLine();//换行 => 相当于写入了一个\n
        }
        bw.flush();
    }catch(FileNotFoundException e){
        e.printStackTrace();
    }catch(IOException e){
        e.printStackTrace();
    }
}
