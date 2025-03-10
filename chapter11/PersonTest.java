/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-09 06:20:39
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-09 06:54:07
 * @FilePath: /workspace/STUDY/chapter11/PersonTest.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
/**
 * @Author: yuanyou
 * @Date: 2025-03-09 06:20:39
 * @LastEditTime: 2025-03-09 06:20:53
 */
package chapter11;

public class PersonTest {

    public static void main(String[] args){

        Person p1 = new Person("刘德华", 54, "双重人格");
        //p1.age = 30;// 对象p1的年龄重新赋值为30
        p1.setAge(30);
        System.out.println(p1.getAge());

        String name = p1.getName();
    }
    
}
