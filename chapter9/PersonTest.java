/*
 * @Author: yuanyou
 * @Date: 2025-03-05 12:08:02
 */
public class PersonTest {
    //这里的p成为对象名，跟数组名一样，本质都是变量。只是在面向对象中称之为对象名
    public static void main(String[] args){
        Person p = new Person();//构建了一个具体的人，只是这个人目前还没有名字，性别和年龄
        System.out.println(p.name + "\t" + p.sex + "\t" + p.age);
       
        p.name = "cy";
        p.sex = "女";
        p.age = 20;
        System.out.println(p.name + "\t" + p.sex + "\t" + p.age);
        p.work();
        p.eat();
        p.sleep();

        Person p1 = new Person();
        p1.name = "张学友";
        p1.sex = "男";
        p1.age = 52;
        System.out.println(p1.name + "\t" + p1.sex + "\t" + p1.age);
        p1.work();
        p1.eat();
        p1.sleep();

        Person p2 = new Person();
        p2.name = "黎明";
        p2.sex = "男";
        p2.age = 45;
        System.out.println(p2.name + "\t" + p2.sex + "\t" + p2.age);
        p2.work();
        p2.eat();
        p2.sleep();
    }
}

