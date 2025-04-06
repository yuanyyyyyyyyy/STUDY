package chapter18.com.cyx.io;

/**
 * 将一个字节流转成字符流
 */
import java.io.*;
public class IOConverter {

    public static void main(String[] args) {
        write();
        read();
    }

    private static void write(){

        try(OutputStream os = new FileOutputStream("STUDY/F/lines.txt");
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw)){
            String[] lines = {
                    "这是写入的第一行",
                    "这是写入的第二行",
                    "这是写入的第三行"
            };
            for(String line: lines){
                bw.write(line);
                bw.newLine();
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void read(){
        try(InputStream is = new FileInputStream("STUDY/F/lines.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr)){
            while(true){
                String line = reader.readLine();
                if(line == null) break;
                System.out.println(line);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
