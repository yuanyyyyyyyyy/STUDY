package chapter16.com.cyx.string;

import java.nio.charset.Charset;
/**
 * 获取字符数组
 * 获取字节数组
 */
public class Example7 {
    public static void main(String[] args) {
        String s = "My God";
        char[] valus = s.toCharArray();//获取字符数组
        for(int i = 0;i < valus.length;i++){
            System.out.println(valus[i]);
        }

        byte[] bytes = s.getBytes();//获取字节数组
        for(int i = 0;i < bytes.length;i++){
            System.out.println(bytes[i]);
        }

        byte[] bytes1 = s.getBytes(Charset.forName("GB2312"));//获取指定编码下的字节数组
        for(int i = 0;i < bytes1.length;i++){
            System.out.println(bytes1[i]);
        }
    }
}
