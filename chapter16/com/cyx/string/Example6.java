/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-19 02:34:15
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-19 02:57:09
 * @FilePath: /workspace/STUDY/chapter16/com/cyx/string/Example6.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter16.com.cyx.string;

/**
 * 字符串替换
 */
public class Example6 {

    public static void main(String[] args){
        String s = "Hello World";
        String s1 = s.replace('o', 'a');//使用新的字符替换字符串中存在的旧的字符
        System.out.println(s);
        System.out.println(s1);

        String s2 = s.replace("o", "a");//使用新的字符串替换字符串中存在的旧的字符串
        System.out.println(s2);

        String info = "a1b2c3d4e5";
        /**
         * regular expression 正则表达式
         * 三至五位整数的正则表达式 099 [123456789][0123456789][0123456789]
         * [1-9][0-9]{2,4}
         * 英文字符串正则表达式
         * [a-zA-Z]+
         */
        String result1 = info.replaceAll("[0-9]", "");
        System.out.println(result1);
        String result2 = info.replaceAll("[a-zA-Z]", "");
        System.out.println(result2);
        
    }
}
