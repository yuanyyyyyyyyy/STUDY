/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-10 06:32:00
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-10 06:51:25
 * @FilePath: /workspace/STUDY/chapter12/com/cyx/inheritance/animal/Animal.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter12.com.cyx.inheritance.animal;

public class Animal {

    protected String name;

    protected int age;

    protected void eat(){
        System.out.println("吃东西");
    }

    protected void sleep(){
        System.out.println("睡觉");
    }
}
