/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-19 07:53:56
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-19 07:58:21
 * @FilePath: /workspace/STUDY/chapter16/com/cyx/builder/Example4.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter16.com.cyx.builder;

public class Example4 {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("admin");
        builder.reverse();//倒序 nimda
        System.out.println(builder);
        builder.insert(2, ",");//在偏移量后面位置插入一个字符串 ni,mda
        System.out.println(builder);
        //需要注意的是：length()方法返回的是char[]中使用的数量
        System.out.println(builder.length()); // 6

        StringBuilder sb = new StringBuilder("abababa");
        int index1 = sb.indexOf("ab");//获取字符串第一次出现的位置
        int index2 = sb.lastIndexOf("ab");//获取字符串最后一次出现的位置
        System.out.println(index1);//0
        System.out.println(index2);//4
    }
}
