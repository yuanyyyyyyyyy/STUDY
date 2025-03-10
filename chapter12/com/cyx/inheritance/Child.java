/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-09 12:30:08
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-10 04:41:00
 * @FilePath: /workspace/STUDY/chapter12/com/cyx/inheritance/Child.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
/**
 * @Author: yuanyou
 * @Date: 2025-03-09 12:30:08
 * @LastEditTime: 2025-03-09 12:30:11
 */
package chapter12.com.cyx.inheritance;

public class Child extends Father{

    //如果一个类中没有定义构造方法，那么编译器会自动为该类添加一个默认的无参构造方法
    public Child(){
        super();//如果子类构造方法中没有显示的调用父类的构造方法,那么编译器会自动插入一个super()调用父类的无参构造
    }
    public void show(){
        //本类中未定义name变量,但是却可以使用,说明name变量是从父类中继承过来的
        System.out.println(name);
        System.out.println(sex);
        //本类中未定义eat()方法,但是却可以使用,说明eat()方法是从父类中继承过来的
        eat();
        sleep();
    }
}
