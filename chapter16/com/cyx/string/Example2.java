/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-15 13:35:34
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-17 13:03:23
 * @FilePath: /workspace/STUDY/chapter16/com/cyx/string/Example2.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter16.com.cyx.string;

import java.nio.charset.Charset;

public class Example2 {

    public static void main(String[] args) {
        String s = "超用心在线教育";
        System.out.println(s);

        //这里会创建两个对象: 一个是字面量会在常量池中创建一个对象，
        //另一个是new String("")构造方法在堆中创建出来的对象
        String s1 = new String("超用心在线教育");
        System.out.println(s1);

        char[] valus = {'a', 'd', 'm', 'i', 'n'};
        String s2 = new String(valus);
        System.out.println(s2);
        //在使用这个构造方法时必须要考虑到数组下标越界的可能性
        String s3 = new String(valus, 1, 3);
        System.out.println(s3);

        //字节可以存储整数，字符也可以使用整数表示，这个整数就是ASCII码对应的整数值
        byte[] bytes = {97, 98, 99, 100, 101};
        String s4 = new String(bytes);
        System.out.println(s4);
        String s5 = new String(bytes, 1, 3);
        System.out.println(s5);

        Charset charset = Charset.forName("UTF-8");//构建UTF-8字符集
        String s6 = new String(bytes, charset);
        System.out.println(s6);
    }
}
