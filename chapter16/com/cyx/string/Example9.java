/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-19 03:15:22
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-19 03:29:09
 * @FilePath: /workspace/STUDY/chapter16/com/cyx/string/Example9.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter16.com.cyx.string;

/**
 * 字符串分割
 * 字符串匹配正则表达式
 */
public class Example9 {

    public static void main(String[] args) {
        String s = "a1b2c3d4e5A";//[z-z0-9]+
        String[] arr = s.split("[0-9]");//将字符串按照匹配的正则表达式分割
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        String personInfo = "刘德华,男,53,很帅气";
        String[] arr1 = personInfo.split(",");
        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }

        String regex = "[a-z0-9]+";
        boolean match = s.matches(regex);//检测字符串是否匹配给定的正则表达式
        System.out.println(match);
            
    }
}
