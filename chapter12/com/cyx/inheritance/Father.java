/**
 * @Author: yuanyou
 * @Date: 2025-03-09 12:25:37
 * @LastEditTime: 2025-03-09 12:25:40
 */
package chapter12.com.cyx.inheritance;

public class Father {

    String name;

    public String sex;

    public Father(){
        super();
    }

    protected void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSex(){
        return sex;
    }

    public void setSex(String sex){
        this.sex = sex;
    }
}
