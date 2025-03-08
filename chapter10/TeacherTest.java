/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-08 06:44:46
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-08 07:53:41
 * @FilePath: /workspace/STUDY/chapter10/TeacherTest.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
/**
 * @Author: yuanyou
 * @Date: 2025-03-08 06:44:46
 * @LastEditTime: 2025-03-08 07:41:37
 */
import java.util.Scanner;

public class TeacherTest{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Teacher t = new Teacher();//创建一个老师对象

        for(int i = 0; i < 3;i++)
        {
            System.out.println("请输入学生姓名: ");
            String name = sc.next();
            System.out.println("请输入学生性别: ");
            String sex = sc.next();
            System.out.println("请输入学生年龄: ");
            int age = sc.nextInt();
            System.out.println("请输入学生成绩: ");
            double score = sc.nextDouble();

            /*
            Stu stu = new Stu(name, sex, age, score);
            t.addStu(stu);*/

            t.addStu(new Stu(name, sex, age, score));
        }
    }
}