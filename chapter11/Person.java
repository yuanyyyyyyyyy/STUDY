/**
 * @Author: yuanyou
 * @Date: 2025-03-09 06:13:53
 * @LastEditTime: 2025-03-09 06:14:01
 */
package chapter11;

public class Person {
    private String name;//姓名

    //private表示私有的意思, 相当于个人隐私
    private int age;//年龄

    private String secret;//秘密

    public Person(String name, int age, String secret){
        this.name = name;
        this.age = age;
        this.secret = secret;
    }

    //getter和setter方法
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age < 0 || age > 200){
            System.out.println("年龄不合法");
        }else{
            this.age = age;
        }
    }

    public String getSecret(){
        return secret;
    }

    public void setSecret(String secret){
        this.secret = secret;
    }


}
