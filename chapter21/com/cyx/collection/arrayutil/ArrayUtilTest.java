/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-15 06:34:51
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-15 11:43:41
 * @FilePath: /workspace/STUDY/chapter21/com/cyx/collection/ArrayUtilTest.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter21.com.cyx.collection.arrayutil;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil(20);
        util.add(1);
        util.add(2);
        util.add(3);
        util.add(4);
        util.add(5);
        for(int i=0; i<util.size(); i++)
        {
            Object o = util.get(i);
            System.out.println(o);
        }

        System.out.println("=================");
        util.update(1, 10);
        for(int i=0; i<util.size(); i++)
        {
            Object o = util.get(i);
            System.out.println(o);}
            System.out.println("=================");
            util.delete(4);
            for(int i=0; i<util.size(); i++)
            {
                Object o = util.get(i);
                System.out.println(o);
            }
            System.out.println("=================");
    }
}
