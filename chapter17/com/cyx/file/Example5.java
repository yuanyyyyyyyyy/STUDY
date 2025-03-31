package chapter17.com.cyx.file;

/**
 * 递归
 */
import java.util.Scanner;
public class Example5 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        //showMenu();
        gotoLogin();
    }

    // public static void showMenu(){//递归没有出口，将导致栈内存溢出
    //     showMenu();
    // }

    public static void gotoLogin(){
        System.out.println("登陆");
        System.out.println("请输入菜单编号");
        int number = sc.nextInt();

        if(number == 1){
            gotoMain();
        }else{
            System.out.println("感谢使用xx系统");
        }
    }

    public static void gotoMain(){
        System.out.println("主菜单");
        System.out.println("请输入菜单编号");
        int number = sc.nextInt();
        if(number == 5){
            gotoLogin();
        }else{
            System.out.println("你选择了其他菜单");
        }
    }
}
