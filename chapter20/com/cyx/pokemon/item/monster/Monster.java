/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-10 12:45:43
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-12 13:23:44
 * @FilePath: /workspace/STUDY/chapter20/com/cyx/pokemon/item/monster/Monster.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter20.com.cyx.pokemon.item.monster;

import chapter20.com.cyx.pokemon.item.Item;
import chapter20.com.cyx.pokemon.item.pokemon.Pokemon;
import chapter20.com.cyx.pokemon.util.Tools;

/**
 * 怪物
 */
public abstract class Monster extends Item{

    /**
     * 攻击力
     */
    protected int attack;
    /**
     * 防御力
     */
    protected int defense;
    /**
     * 生命值
     */
    protected int health;
    /**
     * 怪物当前血量
     */
    protected int currentHealth;

    public Monster(String name, int levelNumber){
        super(name, levelNumber);
    }

    public int getCurrentHealth() {
        return currentHealth;
    }
    
    
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
    
    public int getDefense(){
        return defense;
    }
    
    /**
     * 怪物恢复
     */
    public void resum(){
        currentHealth = health;
    }

    /**
     * 攻击宠物小精灵
     * @param pokemon 宠物小精灵
     */
    public void attackPokemon(Pokemon pokemon){
        int minusHealth = this.attack * this.attack / pokemon.getDefense();
        if(minusHealth == 0){//伤害为0， 需要调整
            minusHealth = 1;
        }else if(minusHealth > pokemon.getCurrentHealth()){//如果伤害比宠物小精灵当前血量还要高
            minusHealth = pokemon.getCurrentHealth();//上海就应该等于宠物小精灵当前血量
        }
        //剩余血量
        int restHealth = pokemon.getCurrentHealth() - minusHealth;
        pokemon.setCurrentHealth(restHealth);
        System.err.println(name + "对" + pokemon.getName() + "发动攻击，造成了" + minusHealth + "伤害，" + pokemon.getName() + "剩余血量为" + restHealth);
    }

    /**
     * 怪物掉落装备
     * @return
     */
    public Item drop(){
        return Tools.getRandomItem(levelNumber);
    }

    @Override
    public String getItemInformation(){ //被探索了就展示怪物信息
        return discovery ? name : "■";
    }
}
