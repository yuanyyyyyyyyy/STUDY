/**
 * @Author: yuanyou
 * @Date: 2025-03-08 11:16:20
 * @LastEditTime: 2025-03-08 11:25:17
 */

import java.util.Scanner;

/**
  * object oriented programming 面向对象编程
  */
public class OOP {

    public static void main(String[] args){
        gotoMain();
    }
    
    //主菜单
    public static Menu[] mainMenus= {
        new Menu(1, "学生成绩管理"),
        new Menu(2, "学生选课管理"),
        new Menu(3, "退出系统")
    };

    //学生选课管理子菜单（二级菜单）
    public static Menu[] secondMenus = {
        new Menu(1, "增加成绩"),
        new Menu(2, "修改成绩"),
        new Menu(3, "删除成绩"),
        new Menu(4, "查询成绩"),
        new Menu(5, "返回主菜单")
    };

    public static Scanner sc = new Scanner(System.in);

    //去主菜单
    public static void gotoMain(){
        showMenu(mainMenus);

        int number = sc.nextInt();
        if(number == 1){
            gotoSecond();
        }else if(number == 2){
            System.out.println("你选择了学生选课管理");
            gotoMain();
        }else{
            System.out.println("感谢使用呱呱系统：>");
            System.exit(0);
        }
    }

    public static User user = new User();

    //去二级菜单
    public static void gotoSecond(){
        showMenu(secondMenus);
        int order = sc.nextInt();
        switch(order){
            case 1:
                user.addScore();//用户增加成绩
                gotoSecond();
                break;
            case 2:
                user.updateScore();//用户修改成绩
                gotoSecond();
                break;
            case 3:
                user.deleteScore();//用户删除成绩
                gotoSecond();
                break;
            case 4:
                user.searchScore();//用户查询成绩
                gotoSecond();
                break;
            case 5:
                gotoMain();
                break;
        }
    }

    //展示菜单
    public static void showMenu(Menu[] menus){
        for(int i = 0;i < menus.length;i++){
            menus[i].show();
        }
        System.out.println("请选择菜单编号：");
    }

    
}
