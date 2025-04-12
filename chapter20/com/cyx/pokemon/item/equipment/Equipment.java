/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-10 13:42:52
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-11 11:54:25
 * @FilePath: /workspace/STUDY/chapter20/com/cyx/pokemon/item/equipment/Equipment.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter20.com.cyx.pokemon.item.equipment;

import chapter20.com.cyx.pokemon.item.Item;
/**
 * 装备
 */
public abstract class Equipment extends Item{

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

    public Equipment(String name, int levelNumber){
        super(name, levelNumber);
    }

    @Override
    public String getItemInformation(){
        return name + "：攻击 = " + attack + " 防御 =" + defense + " 生命值=" + health;
    }

    /**
     * 换装前应该比较新装备是否比旧装备好，
     * 因此需要在装备类Equipment中添加装备比较的方法
     */

     /**
      * 是否比其他装备好
      * @param other
      * @return
      */
      public boolean isBetter(Equipment other){
        //首先必须保证是同类型装备
        if(this.getClass() == other.getClass()){
            int total1 = this.attack + this.defense + this.health >> 1;
            int total2 = other.attack + other.defense + other.health >> 1;
            return total1 > total2;
        }
        return false;
    }

    public int getHealth() {
        return health;
    }

    public int getDefense() {
        return defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    
}
