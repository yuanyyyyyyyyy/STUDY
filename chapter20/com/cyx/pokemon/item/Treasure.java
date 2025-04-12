/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-10 12:29:40
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-11 12:46:10
 * @FilePath: /workspace/STUDY/chapter20/com/cyx/pokemon/item/Treasure.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter20.com.cyx.pokemon.item;

import chapter20.com.cyx.pokemon.item.equipment.Armor;
import chapter20.com.cyx.pokemon.item.equipment.Bracelet;
import chapter20.com.cyx.pokemon.item.equipment.Helmet;
import chapter20.com.cyx.pokemon.item.equipment.Leggings;
import chapter20.com.cyx.pokemon.item.equipment.Necklace;
import chapter20.com.cyx.pokemon.item.equipment.Ring;
import chapter20.com.cyx.pokemon.item.equipment.Shoe;
import chapter20.com.cyx.pokemon.item.equipment.Weapon;
import chapter20.com.cyx.pokemon.item.pokemon.Bikachu;
import chapter20.com.cyx.pokemon.item.pokemon.Bulbasaur;
import chapter20.com.cyx.pokemon.item.pokemon.Charmander;
import chapter20.com.cyx.pokemon.item.pokemon.Jolteon;
import chapter20.com.cyx.pokemon.util.Tools;


/**
 * 宝箱
 */
public class Treasure extends Item{

    public Treasure(int levelNumber){
        super("宝箱", levelNumber);
    }
    @Override
    public String getItemInformation(){
        return discovery ? "۞" : "■";
    }

    /**
     * 开启宝箱能够获得一个物品
     * 4. 宝箱分析
     * 可以开出药品、装备或者宠物小精灵、比例为6 : 3 : 1,
     * 因为药品、装备、小精灵还未设计，所以暂时先写简单的逻辑实现。
     */

    //实现宝箱开启功能
    public Item open(){
        return Tools.getRandomItem(levelNumber);
    }
}
