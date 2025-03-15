/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-12 16:19:34
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-15 07:47:59
 * @FilePath: /workspace/STUDY/chapter14/com/cyx/polymorphism/hashcode/StudentTest.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter14.com.cyx.polymorphism.hashcode;

public class StudentTest {

    public static void main(String[] args) throws InterruptedException {
        Student s1 = new Student("张三", 1);
        Student s2 = new Student("张三", 1);
        boolean result = s1.equals(s2);

        System.out.println(result);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1);

        show();
        //garbage collextor
        System.gc();//调用系统的垃圾回收器进行垃圾回收
        Thread.sleep(1000);
        System.out.println("垃圾回收器开始工作，这是最后一行代码了");

    }

    public static void show(){
        //s对象的作用范围只是在show()方法中，一旦方法执行完毕，那么s对象就应该消亡，释放内存
        Student s = new Student("张三", 1);
        System.out.println(s);
    }

    
}
