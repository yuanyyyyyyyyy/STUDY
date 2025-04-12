/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-11 12:27:00
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-12 01:52:59
 * @FilePath: /workspace/STUDY/chapter20/com/cyx/pokemon/item/monster/Ramoraid.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter20.com.cyx.pokemon.item.monster;

import chapter20.com.cyx.pokemon.util.Tools;

/**
 * 铁炮鱼
 */
public class Ramoraid extends Monster{

    public Ramoraid(int levelNumber){
        super("铁炮鱼", levelNumber);
        this.attack = Tools.getRandomNumber(60, 70, levelNumber);
        this.defense = Tools.getRandomNumber(50, 60, levelNumber);
        this.health = Tools.getRandomNumber(900, 1100, levelNumber);
        this.currentHealth = this.health;
    }

    @Override
    public String getItemInformation(){
        return discovery ? "C" : "■";
    }
}
