/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-19 03:40:14
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-19 03:40:18
 * @FilePath: /workspace/STUDY/chapter16/com/cyx/builder/Example1.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter16.com.cyx.builder;

public class Example1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();//构建了一个初始化容量为16的字符串构建器(默认容量为16)
        StringBuilder sb2 = new StringBuilder(1024);//构建了一个初始化容量为1024的字符串构建器
        StringBuilder sb3 = new StringBuilder("超用心在线教育");//构建一个StringBuilder对象，并将指定的字符串存储在其中
    }
}
