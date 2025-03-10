/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-09 13:17:07
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-10 02:07:21
 * @FilePath: /workspace/STUDY/chapter12/com/cyx/inheritance/p2/PersonTest.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter12.com.cyx.inheritance.p2;

public class PersonTest {

    public static void main(String[] args) {
        Doctor d = new Doctor();
        d.setName("张三");
        d.setAge(20);
        d.setProfessional("医生");
        d.cure();
        d.eat();

        Person p1 = new Doctor();//医生是人
        p1.setName("李四");
        p1.setAge(20);
        p1.eat();
        //强制类型转换  int number = (int) 10.5;
        ((Doctor)p1).cure();

        Person p2 = new Programmer();//程序员是人
        p2.setName("马化腾");
        p2.setSex("男");
        p2.setAge(48);
        p2.eat();
        ((Programmer)p2).writeCode();
    }
    
}
