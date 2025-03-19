/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-15 10:16:48
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-15 10:21:13
 * @FilePath: /workspace/STUDY/chapter15/com/cyx/exception/Example4.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter15.com.cyx.exception;

public class Example4 {

    private static int[] numbers = {1, 2, 3, 4, 5};

    public static void main(String[] args){
        try{
            int number = getNumberFromArray(5);
            System.out.println(number);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界了");
            System.exit(0);
        }finally{
            System.out.println("需要执行的代码");
        }
    }

    public static int getNumberFromArray(int index){
        return numbers[index];
    }
}
