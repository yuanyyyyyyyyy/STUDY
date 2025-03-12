/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-12 11:25:56
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-12 11:25:59
 * @FilePath: /workspace/STUDY/chapter14/com/cyx/polymorphism/P1/Child.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter14.com.cyx.polymorphism.P1;

//方法重写
//运行时多态

public class Child extends Father {

    @Override
    public void show(){
        System.out.println("Child Show");
    }
}
