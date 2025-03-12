package chapter14.com.cyx.polymorphism.hashcode;

public class Student {

    private String name;

    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //hashCode()方法被重写之后，返回的值就不再是对象的内存地址
    @Override
    public int hashCode(){
        return 1;
    }
}
