/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-09 03:19:34
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-09 03:26:29
 * @FilePath: /workspace/STUDY/chapter18/chapter19/com/cyx/inner/clazz/local/LocalClass.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter19.com.cyx.inner.clazz.local;

/**
 * 使用局部内部类描述使用计算器计算两个数的和
 */
public class LocalClass {

    public static void main(String[] args) {
        int result = calculate(1, 3);
        System.out.println(result);
    }

    public static int calculate(int a, int b){
        class Calculate{ //局部内部类
            private int num1, num2;

            public Calculate(int num1, int num2){
                this.num1 = num1;
                this.num2 = num2;
            }

            public int calculate(){
                return num1 + num2;
            }
        }

        Calculate c = new Calculate(a, b);
        return c.calculate();
    }
}
