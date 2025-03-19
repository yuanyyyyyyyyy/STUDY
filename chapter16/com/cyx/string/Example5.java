/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-17 13:35:49
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-17 13:38:03
 * @FilePath: /workspace/STUDY/chapter16/com/cyx/string/Example5.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter16.com.cyx.string;

public class Example5 {

    public static void main(String[] args) {
        String s = "java是一门非常高深的语言";
        //字符串截取，截取使用的是左闭右开[0, 4)
        String sub1 = s.substring(0, 4);
        System.out.println(sub1);
        String sub2 = s.substring(7);
        System.out.println(sub2);
    }
}
