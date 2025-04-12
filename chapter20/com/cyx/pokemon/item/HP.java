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

}
