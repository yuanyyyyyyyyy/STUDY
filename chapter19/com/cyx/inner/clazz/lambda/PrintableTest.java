/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-10 11:34:44
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-10 11:39:04
 * @FilePath: /workspace/STUDY/chapter19/com/cyx/lambda/PrintableTest.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter19.com.cyx.inner.clazz.lambda;

public class PrintableTest {

    public static void main(String[] args) {
        // Printable p = new Printable(){
        //     @Override
        //     public void print(Object o){
        //         System.out.println(o);
        //     }
        // };

        //函数式编程思想
        Printable p = (Object o) -> {
            System.out.println(o);
        };
        p.print("这是一个字符串");
    }
}
