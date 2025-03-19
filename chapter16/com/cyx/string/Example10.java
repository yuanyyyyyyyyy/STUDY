/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-19 03:30:21
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-19 03:38:44
 * @FilePath: /workspace/STUDY/chapter16/com/cyx/string/Example10.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter16.com.cyx.string;

/**
 * intern() 方法会将 s3 放入字符串常量池
 */
public class Example10 {

    public static void main(String[] args) {
        String s1 = "超用心";
        String s2 = "在线教育";
        String s3 = s1 + s2;
        String s4 = "超用心在线教育";
        System.out.println(s3 == s4);
        /**
         * 将字符串s3放入字符串常量池,放入时会先检测常量池中是否存在s3字符串,
         * 如果字符串常量池中存在字符串s3,那么s5直接使用常量池中的s3字符串地址即可。
         * 如果不存在，则在常量池中创建字符串s3
         */
        String s5 = s3.intern();
        System.out.println(s5 == s4);
    }
}
