/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-19 08:00:35
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-19 08:05:15
 * @FilePath: /workspace/STUDY/chapter16/com/cyx/exercise/Exercise1.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter16.com.cyx.exercise;

public class Exercise1 {

    public static void main(String[] args) {
        String s = "ababababababababa";
        String target = "aba";
        int times = 0;//记录出现次数
        int length = s.length();//字符串的长度
        int targetLength = target.length();//目标字符串的长度
        int maxIndex = length - targetLength;//遍历字符串时的最大下标
        for(int i = 0; i <= maxIndex; i++){
            String s1 = s.substring(i, i+targetLength);
            if(s1.equals(target)){
                times++;
            }
        }
        System.out.println(times);
    }
}
