/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-17 13:13:42
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-17 13:21:57
 * @FilePath: /workspace/STUDY/chapter16/com/cyx/string/Example3.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter16.com.cyx.string;

public class Example3 {

    public static void main(String[] args){
        String s1 = "超用心在线教育";
        int length = s1.length();//获取字符串的长度
        System.out.println(length);

        String s2 = "abc";
        String s3 = "abc";
        String s4 = "Abc";
        System.out.println(s2 == s3);
        //比较字符串之间进行比较时，首先会查看两个字符串的长度是否一致，
        //如果一致，再看其中的每一个字符是否相同

        System.out.println(s2.equals(s3));//比较两个字符串是否相同
        System.out.println(s2.equals(s4));
        System.out.println(s2.equalsIgnoreCase(s4));//忽略大小写比较两个字符串是否相同

        String s5 = s2.toUpperCase();//转换为大写
        System.out.println(s5);

        String s6 = s4.toLowerCase();//转换为大写
        System.out.println(s6);


    }
}
