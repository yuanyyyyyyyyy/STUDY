/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-10 13:25:11
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-13 07:28:21
 * @FilePath: /workspace/STUDY/chapter20/com/cyx/pokemon/item/HP.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter20.com.cyx.pokemon.item;

/**
 * 药品：回复血量
 * 
 * 5. 药品分析
 * 恢复血量与关卡有关，药品可以堆叠
 */
public class HP extends Item{

    private int count;

    public HP(int levelNumber, int count){
        super("天山雪莲", levelNumber);
        this.count = count;
    }

    

    /**
     * 使用药品可以恢复血量
     */
    public int use(){
        count--;
        return levelNumber * 500;
    }

    /**
     * 检测药品是否可以被销毁
     */
    public boolean canDestory(){
        return count == 0;
    }

    @Override
    public String getItemInformation(){
        return name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }



    /**
     * 堆叠药品
     * @param count
     */
    public void addCount(int count) {
        this.count += count;
    }

}
