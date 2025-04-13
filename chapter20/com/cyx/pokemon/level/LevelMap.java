package chapter20.com.cyx.pokemon.level;

import chapter20.com.cyx.pokemon.Adventurer;
import chapter20.com.cyx.pokemon.item.DisplayItem;
import chapter20.com.cyx.pokemon.item.Item;
import chapter20.com.cyx.pokemon.item.Portal;
import chapter20.com.cyx.pokemon.item.Treasure;
import chapter20.com.cyx.pokemon.item.monster.CattleMonster;
import chapter20.com.cyx.pokemon.item.monster.Mamoswine;
import chapter20.com.cyx.pokemon.item.monster.Moltres;
import chapter20.com.cyx.pokemon.item.monster.Ramoraid;
import chapter20.com.cyx.pokemon.util.Tools;
/**
 * 关卡地图
 *
 * 10.地图分析
 * 每一个物品有两行信息，上面一行纯网格线，下面一行有网格线，也有物品信息
 * 地图随机生成，上面包含有宝箱、怪物和传送门，宝箱可以开出药品、装备或宠物小精灵，比例为6 : 3 : 1。
 * 如果是第一关，第一个位置为冒险家进入地图的位置，第二个位置为初级怪物象牙猪。
 * 如果是其他关卡，第一个位置为返回上一关卡的传送门，第二个位置为冒险家进入地图的位置。
 */
public class LevelMap {

    /**
     * 关卡编号
     */
    private int number;

    /**
     * 地图上的物品：9x9
     */
    private final DisplayItem[][] items = new DisplayItem[9][9];

    /**
     * 记录冒险家在地图中的位置
     */
    private int currentRow, currentCol;

    public LevelMap(int number){
        this.number = number;
        generate();
    }

    /**
     * 生成地图 => 宝箱：怪物：传送门 = 39 ：39 ：1
     * 第一个位置和第二个位置不能使用
     */
    private void generate(){
        if(number == 1){//第一关卡
            //第二个位置为初级怪物象牙塔
            items[0][1] = new Mamoswine(number);
            items[0][0] = new Mamoswine(number);
        }else{//其他关卡
            //第一个位置为返回上一层的传送门
            items[0][0] = new Portal(false);
            items[0][1] = new Portal(false);
        }

        //记录生成的宝箱数量
        int generatedTreasure = 0;
        //记录生成的怪物数量
        int generatedMonster1 = 0;//记录生成的初级怪物数量
        int generatedMonster2 = 0;//记录生成的中级怪物数量
        int generatedMonster3 = 0;//记录生成的高级怪物数量
        int generatedMonster4 = 0;//记录生成的究极怪物数量
        //记录生成的传送门数量
        int generatedPortal = 0;

        while(generatedTreasure < 39
            || (generatedMonster1 + generatedMonster2 + generatedMonster3 + generatedMonster4) < 39
            || generatedPortal == 0){
        
            //获取随机坐标
            int index = Tools.getRandomNumber(2, 81);
            //计算行和列
            int row = index / items[0].length;
            int col = index % items[0].length;
            //目标位置已经有物品存在
            if(items[row][col] != null) continue;
            //获取一个随机数
            int rate = Tools.getRandomNumber(79);
            if(rate == 0){//传送门
                //传送门已经生成了，直接跳过
                if(generatedPortal == 1) continue;
                items[row][col] = new Portal(true);
                generatedPortal += 1; 
            }else if(rate < 40){//宝箱
                //宝箱已经全部生成完毕，直接跳过
                if(generatedTreasure == 39) continue;
                items[row][col] = new Treasure(number);
                generatedTreasure += 1;
            }else{//怪物 初级：中级：高级：究极 = 18：12：6：3
                int num = Tools.getRandomNumber(39);
                if(num < 3){//究极怪物
                    //究极怪物已经全部生成完毕，全部跳过
                    if(generatedMonster4 == 3) continue;
                    items[row][col] = new Moltres(number);
                    generatedMonster4 += 1;
                }else if(num < 9){//高级怪物
                    //高级怪物已经全部生成完毕，全部跳过
                    if(generatedMonster3 == 6) continue;
                    items[row][col] = new Ramoraid(number);
                    generatedMonster3 += 1;
                }else if(num < 21){//中级怪物
                    //中级怪物已经全部生成完毕，全部跳过
                    if(generatedMonster2 == 12) continue;
                    items[row][col] = new CattleMonster(number);
                    generatedMonster2 += 1;
                }else{//初级怪物
                    //初级怪物已经全部生成完毕，全部跳过
                    if(generatedMonster1 == 18) continue;
                    items[row][col] = new Mamoswine(number);
                    generatedMonster1 += 1;
                }
            }
        }
            
    }

    /**
     * 获取给定方向位置的物品信息
     * @param direct 方向
     * @return 
     */
    public DisplayItem getPositionItem(char direct){
        int targetRow = currentRow, targetCol = currentCol;
        switch(direct){
            case 'W'://向上
                if(targetRow == 0){//第一行，上不去
                    return null;
                }
                targetRow -= 1;
                break;
            case 'A'://向左
                if(targetCol == 0){//第一列，左不了
                    return null;
                }
                targetCol -= 1;
                break;
            case 'S'://向下
                if(targetRow == items.length - 1){//最后一行，下不去
                    return null;
                }
                targetRow += 1;
                break;
            case 'D'://向右
                if(targetCol == items[currentRow].length - 1){//最后一列，右不了
                    return null;
                }
                targetCol += 1;
                break;
        }
        return items[targetRow][targetCol];
    }

    /**
     * 给定方向移动冒险家的位置
     * @param direct 方向
     */
    public void move(char direct){
        int oldRow = currentRow, oldCol = currentCol;
        //获取冒险家
        DisplayItem adventurer = items[oldRow][oldCol];
        switch(direct){
            case 'W'://向上
                if(currentRow == 0){
                    System.err.println("非法移动");
                    Tools.lazy(300L);
                    return;
                }
                currentRow -= 1;
                break;
            case 'A'://向左
                if(currentCol == 0){
                    System.err.println("非法移动");
                    Tools.lazy(300L);
                    return;
                }
                currentCol -= 1;
                break;
            case 'S'://向下
                if(currentRow == items.length - 1){
                    System.err.println("非法移动");
                    Tools.lazy(300L);
                    return;
                }
                currentRow += 1;
                break;
            case 'D'://向右
                if(currentCol == items[currentRow].length - 1){
                    System.err.println("非法移动");
                    Tools.lazy(300L);
                    return;
                }
                currentCol += 1;
                break;
        }
        
        //冒险家新的位置
        items[currentRow][currentCol] = adventurer;
        //原来的位置就不存在物品了
        items[oldRow][oldCol] = null;

    }

    /**
     * 冒险家开始闯关时会进入关卡地图，因此需要在关卡地图LevelMap中添加冒险家
     *
     * 添加冒险家
     * @param adventurer 冒险家
     */
    public void addAdventurer(Adventurer adventurer){
        currentRow = 0;
        if(number == 1){//第一关
            currentCol = 0;
        }else{
            currentCol = 1;
        }
        items[currentRow][currentCol] = adventurer;
    }
    
    /**
     * 展示地图
     */
    public void show(){
        System.out.println("宠物小精灵第" + number + "关：");
        for(int i = 0; i < items.length; i++){
            String line1 = "", line2 = "";
            for(int j = 0; j < items[i].length; j++){
                String info = " ";
                if(items[i][j] != null){
                    info = items[i][j].getItemInformation();//如果存在物品，则展示物品信息
                }
                if(i == 0){//第一行
                    if(j == 0){//第一列
                        line1 += "┌───";
                        line2 += "| " + info + " ";
                    }else if(j == items[i].length - 1){//最后一列
                        line1 += "┬───┐";
                        line2 += "| " + info + " |";
                    }else {
                        line1 += "┬───";
                        line2 += "| " + info + " ";
                    }
                }else{
                    if(j == 0){//第一列
                        line1 += "├───";
                        line2 += "| " + info + " ";
                    }else if(j == items[i].length - 1){//最后一列
                        line1 +=  "┼───┤";;
                        line2 += "| " + info + " |";
                    }else{
                        line1 += "┼───";
                        line2 += "| " + info + " ";
                    }
                }
            }
            System.out.println(line1);
            System.out.println(line2);
        }
        String lastLine = "";//最后一行网格线

        for(int i = 0; i < items[0].length; i++){
            if(i == 0){//第一列
                lastLine += "└───";
            }else if(i == items[0].length - 1){//最后一列
                lastLine += "┴───┘";
            }else{
                lastLine += "┴───";
            }
        }

        System.out.println(lastLine);
    }

    

}
