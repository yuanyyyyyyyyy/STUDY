package chapter19.com.cyx.inner.clazz;

import java.util.Arrays;

public class StudentManger {

    private Student[] stus = {};

    // public static void show(){//静态方法，又称之为类方法  类名.方法名

    // }

    public void addStudent(Student stu){
        stus = Arrays.copyOf(stus, stus.length + 1);
        stus[stus.length - 1] = stu;
    }

    public void showStudent(StudentSorter sorter){
        sorter.sort(stus);
        for(Student stu: stus){
            System.out.println(stu);
        }
    }

    static class StudentSorter{

        private int order;//排序标志：0-降序排列，1-升序排列

        public StudentSorter(){//无参构造，表示降序排列
            this(0);
        }

        public StudentSorter(int order){
            this.order = order;
        }

        public void sort(Student[] stus){
            for(int i = 0; i < stus.length; i++){
                for(int j = 0; j < stus.length - i - 1; j++){
                    int age1 = stus[j].getAge();
                    int age2 = stus[j + 1].getAge();
                    if((order == 0 && age1 < age2) || (order == 1 && age1 > age2)){
                        Student temp = stus[j];
                        stus[j] = stus[j + 1];
                        stus[j + 1] = temp;
                    }
                }
            }
        }
    }


}
