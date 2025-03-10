/**
 * @Author: yuanyou
 * @Date: 2025-03-09 12:51:03
 * @LastEditTime: 2025-03-09 12:51:06
 */
package chapter12.com.cyx.inheritance.p1;

import chapter12.com.cyx.inheritance.Father;

public class Child extends Father{

    public void show(){
        //本类中未定义name变量,但是却可以使用,说明name变量是从父类中继承过来的
        System.out.println(getName());
        System.out.println(sex);
        //本类中未定义eat()方法,但是却可以使用,说明eat()方法是从父类中继承过来的
        eat();
        sleep();
    }
}

