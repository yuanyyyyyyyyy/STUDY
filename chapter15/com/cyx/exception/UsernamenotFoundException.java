/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-15 12:28:17
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-15 12:28:22
 * @FilePath: /workspace/STUDY/chapter15/com/cyx/exception/UsernamenotFoundException.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter15.com.cyx.exception;

/**
 * 用户名不存在异常
 * 
 * 异常命名规范：场景描述+Exception
 */
public class UsernamenotFoundException extends Exception{

    public UsernamenotFoundException(){};

    public UsernamenotFoundException(String message){
        super(message);
    }
}
