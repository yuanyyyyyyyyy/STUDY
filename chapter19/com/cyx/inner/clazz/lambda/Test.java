/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-10 11:25:08
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-10 11:25:11
 * @FilePath: /workspace/STUDY/chapter19/com/cyx/lambda/Test.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter19.com.cyx.inner.clazz.lambda;

public class Test {

    public static void main(String[] args) {
        Actor actor = new Actor(){
            @Override
            public void performance(){
                System.out.println("演员表演节目");
            }
        };
        actor.performance();//执行方法
    }
}
