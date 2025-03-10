/**
 * @Author: yuanyou
 * @Date: 2025-03-09 13:00:24
 * @LastEditTime: 2025-03-09 13:00:26
 */
package chapter12.com.cyx.inheritance.p2;

public class Person {

    private String name;
    
    private String sex;
    
    private int age;

    public Number getScore(){//获取成绩
        return 0;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSex() {
        return sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void eat(){
        System.out.println("吃饭");
    }
}
