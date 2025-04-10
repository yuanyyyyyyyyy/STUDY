package chapter19.com.cyx.inner.clazz;

public class StudentTest {

    public static void main(String[] args) {
        StudentManger manger = new StudentManger();
        manger.addStudent(new Student("张三", 20));
        manger.addStudent(new Student("李四", 21));
        manger.addStudent(new Student("王五", 22));
        manger.addStudent(new Student("赵六", 23));

        //静态嵌套类构造对象的语法：new 外部类类名.内部类类名
        manger.showStudent(new StudentManger.StudentSorter(1));
    }
}
