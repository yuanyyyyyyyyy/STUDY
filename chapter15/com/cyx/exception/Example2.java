/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-15 09:28:21
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-15 09:36:42
 * @FilePath: /workspace/STUDY/chapter15/com/cyx/exception/Example2.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter15.com.cyx.exception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Example2 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        int result = devided();
        System.out.println(result);
    }

    public static int devided() throws InputMismatchException, ArithmeticException{
        int number1 = getNumber();
        int number2 = getNumber();
        return number1 / number2;
    }

    /**
     * 获取一个数字
     * @return
     * @throws InputMismatchException 运行该方法时可能会跑出InputMismatchException异常
     */
    public static int getNumber() throws InputMismatchException{
        System.out.println("请输入一个数字：");
        int number = sc.nextInt();
        return number;
    }
}
