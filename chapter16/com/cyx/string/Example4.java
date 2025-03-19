/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-17 13:22:45
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-17 13:33:30
 * @FilePath: /workspace/STUDY/chapter16/com/cyx/string/Example4.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter16.com.cyx.string;

public class Example4 {

    public static void main(String[] args) {
        String s = "kiley@aliyun.com";
        int number = 'a';
        System.out.println(number);
        //'@' => char => int
        
        //求指定字符在字符串中第一次出现的下标位置
        int index1 = s.indexOf('@');//相互兼容的数据类型之间可以发生自动类型转换
        System.out.println(index1);
        //求指定字符在字符串中最后一次出现的下标位置
        int index2 = s.lastIndexOf('@');
        System.out.println(index2);

        int index3 = s.indexOf('.');//相互兼容的数据类型之间可以发生自动类型转换
        int index4 = s.lastIndexOf('.');
        boolean case1 = (index1 == index2);//保证只有一个@
        boolean case2 = (index3 == index4);//保证只有一个.
        boolean case3 = (index3 - index2 > 1);//@必须在.前面
        boolean case4 = (index1 > 0 && index3 < s.length() - 1);//@不能在最开始  .不能在末尾
        if(case1 && case2 && case3 && case4){
            System.out.println("字符串" + s + "是一个邮箱地址");
        }

        System.out.println(s.charAt(0));//获取字符串中的指定下标的字符
    }
}
