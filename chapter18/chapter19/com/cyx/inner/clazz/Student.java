package chapter18.chapter19.com.cyx.inner.clazz;

/**
 * 使用静态内部类实现学生管理员对学生按年龄进行排序展示的功能
 */
public class Student {

    private String name;

    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
