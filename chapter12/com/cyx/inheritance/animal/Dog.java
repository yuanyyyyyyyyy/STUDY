/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-10 06:53:27
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-10 06:54:35
 * @FilePath: /workspace/STUDY/chapter12/com/cyx/inheritance/animal/Dog.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter12.com.cyx.inheritance.animal;

public class Dog extends Animal{

    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }

    @Override
    public void sleep(){
        System.out.println("狗趴着睡觉");
    }

}
