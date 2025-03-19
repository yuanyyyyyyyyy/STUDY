/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-15 12:32:14
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-15 12:42:51
 * @FilePath: /workspace/STUDY/chapter15/com/cyx/exception/Login.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter15.com.cyx.exception;

import java.util.Scanner;

public class Login {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("请输入账号：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();

        try{
            login(username, password);
        }catch(UsernamenotFoundException e){
            e.printStackTrace();
        }catch(BadCredentialsException e){
            e.printStackTrace();
        }
    }

    public static void login(String username, String password) throws 
    UsernamenotFoundException, BadCredentialsException{

        if("admin".equals(username)){
            if("123456".equals(password)){
                System.out.println("登陆成功");
            }else{
                throw new BadCredentialsException("账号或密码错误");
            }
        }else{
            throw new UsernamenotFoundException("账号不存在");
        }
    }
}
