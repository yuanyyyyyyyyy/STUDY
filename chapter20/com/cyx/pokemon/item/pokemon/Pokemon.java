/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-11 08:02:07
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-12 02:22:06
 * @FilePath: /workspace/STUDY/chapter20/com/cyx/pokemon/item/pokemon/Pokemon.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter20.com.cyx.pokemon.item.pokemon;

/**
 * 宠物小精灵
 * 7.宠物小精灵分析
 * 可以穿戴装备，最多只能穿戴8件装备，每个部位只能穿戴一件。
 * 宠物小精灵有4种类型，每一种都有名字，
 * 同类宠物小精灵都可以进行融合升星，升星提升初始属性50%。
 * 因此宠物小精灵应设计为抽象类
 */

import chapter20.com.cyx.pokemon.item.Item;
import chapter20.com.cyx.pokemon.item.equipment.Armor;
import chapter20.com.cyx.pokemon.item.equipment.Bracelet;
import chapter20.com.cyx.pokemon.item.equipment.Equipment;
import chapter20.com.cyx.pokemon.item.equipment.Helmet;
import chapter20.com.cyx.pokemon.item.equipment.Leggings;
import chapter20.com.cyx.pokemon.item.equipment.Necklace;
import chapter20.com.cyx.pokemon.item.equipment.Ring;
import chapter20.com.cyx.pokemon.item.equipment.Shoe;
import chapter20.com.cyx.pokemon.item.equipment.Weapon;
import chapter20.com.cyx.pokemon.item.monster.Monster;

public abstract class Pokemon extends Item{

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
     * 当前生命值
     */
    protected int currentHealth;
    /**
     * 星级，默认1星
     */
    private int star = 1;

    /**
     * 宠物小精灵能够穿戴8件装备，默认是没有穿戴任何装备
     * 穿戴顺序：头盔、铠甲、护腿、鞋子、武器、项链、戒指、手镯
     */
    private Equipment[] equipments = new Equipment[8];

    public Pokemon(String name){
        super(name);
    }

    /**
     * 换装后，宠物小精灵的攻击、防御、血量会发生改变，但不能改变宠物小精灵本身的属性。
     * 因此获取攻击、防御和血量时，应该将宠物小精灵本身的属性 + 所穿戴装备的属性。
     */
    public int getAttack(){
        int totalAttack = attack;
        for(Equipment equipment: equipments){
            if(equipment != null){
                totalAttack += equipment.getAttack();
            }
        }
        return totalAttack;
    }

    public int getDefense(){
        int totalDefense = defense;
        for(Equipment equipment: equipments){
            if(equipment != null){
                totalDefense += equipment.getDefense();
            }
        }
        return totalDefense;
    }

    public int getHealth(){
        int totalHealth = health;
        for(Equipment equipment: equipments){
            if(equipment != null){
                totalHealth += equipment.getHealth();
            }
        }
        return totalHealth;
    }

    
    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    @Override
    public String getItemInformation(){
        return name + ": 攻击 =" + attack + " 防御 = " + defense + " 生命值=" + health;
    }

    /**
     * 宠物小精灵攻击怪物
     * @param monster 怪物
     */
    public void attackMonster(Monster monster){
        int minusHealth = this.getAttack() * this.getAttack() / monster.getDefense();
        if(minusHealth == 0){//伤害为0，需要调整
            minusHealth = 1;//调整伤害为1点
        }else if(minusHealth > monster.getCurrentHealth()){//如果伤害比怪物当前生命值还高
            minusHealth = monster.getCurrentHealth();//伤害就应该等于怪物当前血量
        }
        //剩余血量
        int restHealth = monster.getCurrentHealth() - minusHealth;
        monster.setCurrentHealth(restHealth);
        System.out.println(name + "对" + monster.getName() + "发动攻击，造成了" + minusHealth + "伤害");
    }

    /**
     * 与其他小精灵融合
     * @param other 其他小精灵
     */
    public void merge(Pokemon other){
        if(star == 10){
            System.out.println(name + "星级已满，无法再融合升星");
        }else{
            this.attack += (other.attack >> 1);
            this.defense += (other.defense >> 1);
            this.health += (other.health >> 1);
            star += 1;
            System.out.println("融合成功");
            System.out.println(getItemInformation());
        }
    }

    /**
     * 更换装备
     * @param newEquipment 新装备
     * @return
     */
    public Equipment changeEquipment (Equipment newEquipment){

        int index = -1;
        
        if(newEquipment instanceof Helmet){ //头盔
            index = 0;
        }else if(newEquipment instanceof Armor){//铠甲
            index = 1;
        }else if(newEquipment instanceof Leggings){//护腿
            index = 2;
        }else if(newEquipment instanceof Shoe){//鞋子
            index = 3;
        }else if(newEquipment instanceof Weapon){//武器
            index = 4;
        }else if(newEquipment instanceof Necklace){//项链
            index = 5;
        }else if(newEquipment instanceof Ring){//戒指
            index = 6;
        }else if(newEquipment instanceof Bracelet){//手镯
            index = 7;
        }

        //旧装备
        Equipment old = equipments[index];
        if(old == null){ //未穿戴装备
            equipments[index] = newEquipment;
        }else{ //已经穿戴装备
            //新装备比旧装备好
            if(newEquipment.isBetter(old)){
                equipments[index] = newEquipment;
            }else{
                old = newEquipment;
            }
        }
        return old;
    }

    public double getHealthPercent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHealthPercent'");
    }

    

    // /**
    //  * 攻击宠物小精灵
    //  * @param pokemon 被攻击的宠物小精灵
    //  */
    // public void attackPokemon(Pokemon pokemon){
    //     int minusHealth = this.attack * this.attack / pokemon.getDefense();
    //     if(minusHealth == 0){//伤害为0，需要调整
    //         minusHealth = 1;//调整伤害为1点
    //     }
    //     pokemon.setHealth(pokemon.getHealth() - minusHealth);
    //     System.out.println(name + "对" + pokemon.getName() + "发动攻击，造成了" + minusHealth + "伤害");
    // }
}
