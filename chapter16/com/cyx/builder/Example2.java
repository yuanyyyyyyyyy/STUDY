/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-19 07:39:23
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-19 07:54:00
 * @FilePath: /workspace/STUDY/chapter16/com/cyx/builder/Example2.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter16.com.cyx.builder;

/**
 * 追加 append
 */
public class Example2 {
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(1024);
        sb.append("超用心在线教育");//将一个字符串添加到StringBuilder存储区
        sb.append(1);
        sb.append(1.0);
        sb.append(true);
        sb.append('a');
        System.out.println(sb);//超用心在线教育11.0truea

        StringBuffer buffer = new StringBuffer(1024);
        buffer.append("超用心在线教育");//将一个字符串添加到StringBuffer存储区 synchronized(同步的)
        buffer.append(1);
        buffer.append(1.0);
        buffer.append(true);
        buffer.append('a');
        System.out.println(buffer);//超用心在线教育11.0truea

        sb.append(buffer);//将StringBuffer存储的内容添加到StringBuilder存储区
        System.out.println(sb);//超用心在线教育11.0truea超用心在线教育11.0truea

        StringBuilder sb1 = new StringBuilder(1024);
        sb1.append("超用心在线教育").append(1).append(1.0).append(true).append('a');
        System.out.println(sb1);//超用心在线教育11.0truea
    }
}
