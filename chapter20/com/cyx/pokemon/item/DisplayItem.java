/**
 * 1.接口设计
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-10 12:30:51
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-10 12:30:55
 * @FilePath: /workspace/STUDY/chapter20/com/cyx/pokemon/item/DisplayItem.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */

package chapter20.com.cyx.pokemon.item;

//地图上物品信息会加密，被探索之后会显示出来，可以使用接口来完成约定
/**
 * 物品显示接口
 */
public interface DisplayItem {

    /**
     * 获取物品信息
     */
    String getItemInformation();
}
