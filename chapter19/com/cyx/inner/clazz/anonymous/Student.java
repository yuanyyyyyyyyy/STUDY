/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-09 03:29:45
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-09 03:29:48
 * @FilePath: /workspace/STUDY/chapter18/chapter19/com/cyx/inner/clazz/anonymous/Student.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter19.com.cyx.inner.clazz.anonymous;

public class Student {

    protected String name;

    protected int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(name + "\t" +age);
    }

}
