/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-15 10:22:53
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-15 10:29:07
 * @FilePath: /workspace/STUDY/chapter15/com/cyx/exception/Example5.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter15.com.cyx.exception;

public class Example5 {

    public static void main(String[] args) {
        int result = getResult();
        System.out.println(result);//10
    }

    public static int getResult(){
        int number = 10;
        try{
            /**
             * 尝试执行
             * 返回值 => 尝试返回一个结果，但发现后面还有finally模块，而finally模块一定会得到执行。
             * 于是在这里只能将返回值( number(10) )使用一个临时变量(例如变量a)存储起来。
             * 然后再执行finally模块，finally模块执行完之后，
             * 再将这个临时变量(a)存储的值(10)返回
             */
            return number;
        }catch(Exception e){
            return 1;
        }finally{
            number++;
        }

    }
}
