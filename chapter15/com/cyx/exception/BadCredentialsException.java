/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-15 12:30:54
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-15 12:30:57
 * @FilePath: /workspace/STUDY/chapter15/com/cyx/exception/BadCredentialsException.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter15.com.cyx.exception;

/**
 * 账号或密码错误异常
 */
public class BadCredentialsException extends Exception{

    public BadCredentialsException(){};

    public BadCredentialsException(String message){
        super(message);
    }
}
