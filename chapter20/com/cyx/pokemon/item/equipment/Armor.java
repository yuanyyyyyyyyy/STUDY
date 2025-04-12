/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-11 07:47:48
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-11 07:47:51
 * @FilePath: /workspace/STUDY/chapter20/com/cyx/pokemon/item/equipment/Armor.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter20.com.cyx.pokemon.item.equipment;

import chapter20.com.cyx.pokemon.util.Tools;

/**
 * 铠甲
 */
public class Armor extends Equipment{

    public Armor(int levelNumber){
        super("铠甲", levelNumber);
        this.attack = 0;
        this.defense = Tools.getRandomNumber(40, 50, levelNumber);
        this.health = Tools.getRandomNumber(200, 250, levelNumber);
    }

}
