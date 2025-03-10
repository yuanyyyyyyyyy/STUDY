package chapter12.com.cyx.inheritance.P3;

public class Student extends person{

    private String name;

    public Student(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    public void show(){
        System.out.println(this.name);//访问本类中定义的name变量
        System.out.println(super.name);//访问父类中定义的name变量

        //如果子类中和父类中没有相同的成员变量，此时使用this和super均可以调用父类的成员变量
        System.out.println(this.sex);
        System.out.println(super.sex);
    }

}
