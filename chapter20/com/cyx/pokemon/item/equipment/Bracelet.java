/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-11 08:00:15
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-12 02:32:43
 * @FilePath: /workspace/STUDY/chapter20/com/cyx/pokemon/item/equipment/Bracelet.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter20.com.cyx.pokemon.item.equipment;

import chapter20.com.cyx.pokemon.util.Tools;

/**
 * 手镯
 */
public class Bracelet extends Equipment{

    public Bracelet(int levelNumber){
        super("手镯", levelNumber);
        this.attack = Tools.getRandomNumber(20, 30, levelNumber);
        this.defense = Tools.getRandomNumber(20, 25, levelNumber);
        this.health = Tools.getRandomNumber(100, 200, levelNumber);
    }
}
