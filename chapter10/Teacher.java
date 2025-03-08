
import java.util.Arrays;

/**
 * @Author: yuanyou
 * @Date: 2025-03-07 16:31:01
 * @LastEditTime: 2025-03-07 16:31:04
 */
public class Teacher {
    public Stu[] stus = {}; //刚开始的时候一个学生也没有

    //添加一个学生信息
    public void addStu(Stu stu){
        stus = Arrays.copyOf(stus, stus.length + 1);//先对数组进行扩容
        stus[stus.length - 1] = stu;
    }
}
