/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-15 10:00:05
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-15 10:12:55
 * @FilePath: /workspace/STUDY/chapter15/com/cyx/exception/Example3.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter15.com.cyx.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        // try{
        //     int number = getNumber();
        //     System.out.println(number);
        // }catch(InputMismatchException e){
        //     e.printStackTrace();//打印异常轨迹
        //     System.out.println(e.getClass().getName());
        //     System.out.println("异常信息：" + e.getMessage());
        //     System.out.println("请不要瞎搞，只能输数字");
        // }
        // System.out.println("发生异常也会执行");

        int result = devided();
        System.out.println(result);
    }

    public static int devided(){
        try{
            int number1 = getNumber();
            int number2 = getNumber();
            return number1 / number2;
        }catch(InputMismatchException e){
            System.out.println("请不要瞎搞，只能输数字");
            return -1;
        }catch(ArithmeticException e){
            System.out.println("在除法运算中除数不能为零");
            return -2;
        }
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
