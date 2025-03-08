import java.util.Scanner;

/**
 * procedure oriented programming 面向过程编程
 */

public class POP {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1.学生成绩管理");
            System.out.println("2.学生选课管理");
            System.out.println("3.退出系统");
            System.out.println("请选择菜单编号: ");
            int number = sc.nextInt();
            if(number == 1){
                outer:
                while(true){
                    System.out.println("1.增加成绩");
                    System.out.println("2.修改成绩");
                    System.out.println("3.删除成绩");
                    System.out.println("4.查询成绩");
                    System.out.println("5.返回主菜单");
                    System.out.println("请选择菜单编号");
                    int order = sc.nextInt();
                    switch(order){
                        case 1:
                            System.out.println("你选择了增加成绩");
                            break;
                        case 2:
                            System.out.println("你选择了修改成绩"); 
                            break;
                        case 3:
                            System.out.println("你选择了删除成绩");
                            break;
                        case 4:
                            System.out.println("你选择了查询成绩");
                            break;
                        case 5:
                            break outer;
                    }
                }

            }else if(number == 2){
                System.out.println("你选择了学生选课管理");
            }else{
                System.out.println("感谢使用呱呱系统");
                break;
            }
        }
    }
}
