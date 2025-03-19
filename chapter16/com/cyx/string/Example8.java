/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-19 03:10:41
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-19 03:14:16
 * @FilePath: /workspace/STUDY/chapter16/com/cyx/string/Example8.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter16.com.cyx.string;

/**
 * 字符串拼接
 * 去除字符串两端的空白字符
 */
public class Example8 {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + s2;
        System.out.println(s3);
        String s4 = s1.concat(s2);//将s2追加到s1的末尾
        System.out.println(s4);

        String s5 = "    ab cde";
        System.out.println(s5);
        String s6 = s5.trim();//将字符串两端的空格修剪掉
        System.out.println(s6);
    }
}
