/**
 * 人类
 */

public class Person {
   public String name;//姓名
   public String sex;//性别
   public int age;//年龄

   public void eat(){
      System.out.println(age + "岁的" + sex + "性同志" + name + "在吃饭：>");
      work();//相当于 this.work()
   }

   public void sleep(){
      System.out.println(age + "岁的" + sex + "性同志" + name + "在睡觉：>");
      work();//相当于 this.work()
   }

   public void work(){
      System.out.println(age + "岁的" + sex + "性同志" + name + "在工作：>");
   }
}
