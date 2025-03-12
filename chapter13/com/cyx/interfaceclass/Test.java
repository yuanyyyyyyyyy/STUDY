/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-12 07:27:38
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-12 07:40:31
 * @FilePath: /workspace/STUDY/chapter13/com/cyx/interfaceclass/Test.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter13.com.cyx.interfaceclass;

public interface Test {

    public static final int number = 10;

    public abstract void test();

    public default int plus(int a, int b){//默认方法
        return a + b;
    }

    public static int multiply(int a, int b){//静态方法
        return a * b;
    }

    private String getName(){
        return "admin";
    }

}
