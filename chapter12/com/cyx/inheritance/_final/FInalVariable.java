/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-10 11:13:12
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-10 11:23:44
 * @FilePath: /workspace/STUDY/chapter12/com/cyx/inheritance/_final/FInalVariable.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter12.com.cyx.inheritance._final;

public class FInalVariable {

    //final修饰的变量一定要在对象创建时完成赋值操作，final修饰的变量称之为常量，不可被更改
    private final int number;

    public FInalVariable(){
        this.number = 10;
    }

    //static final 修饰的变量就是静态变量
    public static final String COUNTRY = "中国";

    public void change(){
        //因为number是一个常量，不能再被更改，因此会报编译错误
        //this.number = 11;
    }

}
