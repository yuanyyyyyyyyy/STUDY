/**
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-10 07:16:16
 * @LastEditTime: 2025-03-10 07:17:41
 */
package chapter12.com.cyx.inheritance.worker;

public class Worker {

    protected String name;//姓名

    protected String number;//员工编号

    protected String dept;//部门

    protected double salary;//薪资


    public Worker(String name, String number, String dept, double salary) {
        this.name = name;
        this.number = number;
        this.dept = dept;
        this.salary = salary;
    }

    public void work(){
        System.out.println("员工要干活");
    }
}
