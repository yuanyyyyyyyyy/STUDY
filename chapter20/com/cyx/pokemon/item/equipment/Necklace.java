/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-11 07:56:46
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-11 07:56:49
 * @FilePath: /workspace/STUDY/chapter20/com/cyx/pokemon/item/equipment/Necklace.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter20.com.cyx.pokemon.item.equipment;

import chapter20.com.cyx.pokemon.util.Tools;

/**
 * 项链
 */
public class Necklace extends Equipment{

    public Necklace(int levelNumber){
        super("项链", levelNumber);
        this.attack = Tools.getRandomNumber(25, 35, levelNumber);
        this.defense = Tools.getRandomNumber(25, 25, levelNumber);
        this.health = Tools.getRandomNumber(120, 180, levelNumber);
    }

}
