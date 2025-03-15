/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-15 08:20:49
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-15 09:26:59
 * @FilePath: /workspace/STUDY/chapter15/com/cyx/exception/Example1.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter15.com.cyx.exception;

import java.util.Scanner;
public class Example1 {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        calculate();
    }

    public static void calculate(){
        // int result = 1 / 0;
        // System.out.println(result);//该行代码不能够被执行

        System.out.println("请输入一个数字: ");
        int number1 = sc.nextInt();
        System.out.println("请输入另一个数字: ");
        int number2 = sc.nextInt();
        if(number2 == 0){
            ArithmeticException e = new ArithmeticException("在除法运算中除数不能为0");
            throw e;
        }

        int result = number1 / number2;
        System.out.println("结果是: " + result);
    }
}


