/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-10 12:49:39
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-12 04:14:37
 * @FilePath: /workspace/STUDY/chapter20/com/cyx/pokemon/item/Item.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */

/**
 * 2. 展示物品设计
 * 冒险家探索地图时，物品信息会具体显示。
 * 换言之，冒险家探索到某物品时，该物品展示具体信息，探索完成后，该物品展示信息为空白。
 * 每一个物品都具有这样的特性，
 * 除此之外，物品大多数都与关卡有关，物品都有名称，
 * 因此可以利用继承的特性来实现。每一种物品展示的信息不一样，
 * 因此父类只能设计为抽象类。
 */
package chapter20.com.cyx.pokemon.item;

/**
 * 物品
 */
public abstract class Item implements DisplayItem{

    /**
     * 物品名称
     */
    protected String name;
    /**
     * 关卡编号
     */
    protected int levelNumber;
    /**
     * 是否被探索
     */
    protected boolean discovery;

    public Item(String name){
        this.name = name;
    }

    public Item(String name, int levelNumber){
        this.name = name;
        this.levelNumber = levelNumber;
    }

    public void setDiscovery(boolean discovery){
        this.discovery = discovery;
    }

    public String getName(){
        return name;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public boolean isDiscovery() {
        return discovery;
    }

}
