package chapter20.com.cyx.pokemon.item;


/**
 * 传送门
 * 3. 传送门分析
 * 传送门有两个方向，一个是返回上一关卡，一个是前往下一关卡，可以使用布尔类型的变量进行控制
 * 见 => 展示物品设计
 */
public class Portal extends Item{

    /**
     * 是否是通往下一关卡的传送门
     */
    private boolean next;

    public Portal(boolean next){
        super("传送门");
        this.next = next;
    }

    public boolean isNext(){
        return next;
    }
    @Override
    public String getItemInformation(){
        if(discovery){
            return next ? "→" : "←";
        }
        return "■";
    }
}
