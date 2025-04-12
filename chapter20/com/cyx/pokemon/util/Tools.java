/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-10 13:35:34
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-11 12:42:32
 * @FilePath: /workspace/STUDY/chapter20/com/cyx/pokemon/util/Tools.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter20.com.cyx.pokemon.util;

/**
 * 工具类
 */
import java.util.Random;

import chapter20.com.cyx.pokemon.item.HP;
import chapter20.com.cyx.pokemon.item.Item;
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

public class Tools {

   /**
    * 随机数对象
    */
   private static final Random RANDOM = new Random();

   /**
     * 获取给定范围内的随机数
     * @param min 最小值
     * @param max 最大值
     * @param levelNumber 关卡编号
     * @return
     */
   public static int getRandomNumber(int min, int max, int levelNumber){
      int diff = (max - min) * levelNumber;
      return RANDOM.nextInt(diff) + min * levelNumber;
   }

   /**
     * 获取给定范围内的随机数[min, max)
     * @param min 最小值
     * @param max 最大值
     * @return
     */

   public static int getRandomNumber(int min, int max){
      return getRandomNumber(min, max, 1);
   }

   /**
   * 获取给定范围内的随机数[0, max)
   * @param max 最大值
   * @return
   */
   public static int getRandomNumber(int max){
      return getRandomNumber(0, max);
   }

   /**
   * 怪物死后会掉落装备、药品或宠物小精灵。
   * 获取一个随机物品
   * @param levelNumber 关卡编号
   * @return
   */

   public static Item getRandomItem(int levelNumber){

      //取[0, 10)范围内的随机数
      int number = Tools.getRandomNumber(10);
      if(number == 0){//获得宠物小精灵
         //比例 初级：中级：高级：究极 = 80：15：4：1
         int rate = Tools.getRandomNumber(100);
         if(rate == 0){//究极宠物小精灵 => 皮卡丘
            return new Bikachu();
         }else if(rate <= 4){//高级宠物小精灵 => 小火龙
            return new Charmander();
         }else if(rate <= 20){//中级宠物小精灵 => 雷精灵
            return new Jolteon();
         }else{//初级宠物小精灵 => 妙蛙种子
            return new Bulbasaur();
         }
      }else if(number <= 3){//获得装备
         //比例 武器：项链：戒指：手镯：头盔：铠甲：护腿：鞋子 = 3：5：8：8：19：19：19：19
         int rate = Tools.getRandomNumber(100);
         if(rate < 3){//武器
            return new Weapon(levelNumber);
         }else if(rate < 8){//项链
            return new Necklace(levelNumber);
         }else if(rate < 16){//戒指
            return new Ring(levelNumber);
         }else if(rate < 24){//手镯
            return new Bracelet(levelNumber);
         }else if(rate < 43){//头盔
            return new Helmet(levelNumber);
         }else if(rate < 62){//铠甲
            return new Armor(levelNumber);
         }else if(rate < 81){//护腿
            return new Leggings(levelNumber);
         }else{//鞋子
            return new Shoe(levelNumber);
         }
      }else{//获得药品
         return new HP(levelNumber, 10);
      }
   }
      
}
