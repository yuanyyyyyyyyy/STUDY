/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-12 11:46:16
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-12 11:50:42
 * @FilePath: /workspace/STUDY/chapter14/com/cyx/polymorphism/animal/ZooKeeperTest.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter14.com.cyx.polymorphism.animal;

public class ZooKeeperTest {

    public static void main(String[] args) {
        ZooKeeper keeper = new ZooKeeper();
        // keeper.feedTiger(new Tiger());
        // keeper.feedPanda(new Panda());
        // keeper.feedMonkey(new Monkey());

        keeper.feedAnimal(new Tiger());
        keeper.feedAnimal(new Panda());
        keeper.feedAnimal(new Monkey());
    }
}
