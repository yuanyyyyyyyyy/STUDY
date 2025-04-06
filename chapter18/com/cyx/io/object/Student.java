/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-06 09:58:22
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-06 09:58:27
 * @FilePath: /workspace/STUDY/chapter18/com/cyx/io/object/student.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter18.com.cyx.io.object;

import java.io.Serializable;
public class Student implements Serializable{

    private String name;

    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
