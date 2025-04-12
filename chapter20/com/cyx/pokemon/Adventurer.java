package chapter20.com.cyx.pokemon;

import chapter20.com.cyx.pokemon.item.DisplayItem;
import chapter20.com.cyx.pokemon.item.HP;
import chapter20.com.cyx.pokemon.item.Item;
import chapter20.com.cyx.pokemon.item.equipment.Equipment;
import chapter20.com.cyx.pokemon.item.pokemon.Bulbasaur;
import chapter20.com.cyx.pokemon.item.pokemon.Pokemon;
import chapter20.com.cyx.pokemon.level.Level;
import chapter20.com.cyx.pokemon.level.LevelMap;

/**
 * 冒险家
 * 冒险家携带背包闯关， 背包中可以容纳装备、药品以及小精灵，默认有10个药品、1个妙蛙种子
 */
public class Adventurer implements DisplayItem{

    /**
     * 装备背包
     */
    private Equipment[] equipments = {};
    /**
     * 药品背包
     */
    private HP[] medicines = {
        new HP(1, 10)
    };
    /**
     * 宠物背包
     */
    private Pokemon[] pokemons = {
        new Bulbasaur()
    };
    /**
     * 总背包
     */
    private Item[][] packageItem = {
        equipments,
        medicines,
        pokemons
    };
    
    @Override
    public String getItemInformation(){
        return "♀";
    }

    /**
     * 完善冒险家Adventurer闯关方法
     * 
     * 开始闯关
     */
    public void start(){
        Level level = new Level(null, 1, null);
        LevelMap map = level.getMap();
        //冒险家进入地图
        map.addAdventurer(this);
        map.show();
    }


}
