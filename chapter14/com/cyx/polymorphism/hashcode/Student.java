package chapter14.com.cyx.polymorphism.hashcode;

public class Student {

    private String name;

    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //@Override
    public boolean equals(Object o){
        if(this == o) return true;
        //比较类的定义是否一致
        if(this.getClass() != o.getClass()) return false;
        //类的定义一致，那个对象o就可以被强制转换为Student
        Student other = (Student)o;
        return this.name.equals(other.name) && this.age == other.age;

    }


    //hashCode()方法被重写之后，返回的值就不再是对象的内存地址
    @Override
    public int hashCode(){
        return name.hashCode() + age;
    }

    @Override
    public String toString(){
        return name + "\t" + age;
    }

    //当一个Student对象变成垃圾事可能会被调用
    @Override
    protected void finalize() throws Throwable{
        this.name = null;
        System.out.println("所有资源已经释放完毕，可以开始清理了");
    }
}
