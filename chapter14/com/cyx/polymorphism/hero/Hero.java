/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-12 11:31:14
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-12 11:33:32
 * @FilePath: /workspace/STUDY/chapter14/com/cyx/polymorphism/hero/Hero.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter14.com.cyx.polymorphism.hero;

public abstract class Hero {

    protected String name;

    public Hero(String name){
        this.name = name;
    }

    public abstract void attact();
}
