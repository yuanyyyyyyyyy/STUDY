/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-19 09:40:20
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-19 10:37:12
 * @FilePath: /workspace/STUDY/chapter17/com/cyx/file/Example1.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter17.com.cyx.file;

import java.io.File;
/**
 * File类构造方法的使用
 */
public class Example1 {

    public static void main(String[] args) {
        File file1 = new File("F:\\a\\b\\c.txt");//通过 给定的字符串路径名 转换为 抽象路径名 来创建File实例
        File file2 = new File("F:\\a\\b", "c.txt");//通过 给定的字符父级串路径 和 子级路径 来创建File实例

        File parent = new File("F:\\a\\b");
        File file3 = new File(parent, "c.txt");//通过 父级抽象路径名 和 字符串子路径 创建File实例
    }
}
