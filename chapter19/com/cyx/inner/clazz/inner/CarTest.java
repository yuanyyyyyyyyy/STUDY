/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-09 03:03:10
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-09 03:13:47
 * @FilePath: /workspace/STUDY/chapter18/chapter19/com/cyx/inner/clazz/inner/CarTest.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter19.com.cyx.inner.clazz.inner;

public class CarTest {

    public static void main(String[] args) {
        Car c = new Car(100000, "奥拓");//c是汽车类的成员，因此c对象中有Engine类成员
        c.show();

        Car.Engine engine = new Car(100000, "奥拓").new Engine("进口", 50000);
        Car c1 = new Car(engine, "奔驰", 150000);
        c1.show();

        Car.Engine engine1 = c.new Engine("进口", 20000);
        Car c2 = new Car(engine1, "宝马", 200000);
        c2.show();
    }
}
