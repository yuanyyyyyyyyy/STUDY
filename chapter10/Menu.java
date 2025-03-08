/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-07 15:05:25
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-08 08:26:31
 * @FilePath: /workspace/STUDY/chapter10/Menu.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
/**
 * @Author: yuanyou
 * @Date: 2025-03-07 15:05:25
 * @LastEditTime: 2025-03-07 15:05:28
 */
public class Menu {
    
    public int order;//编号

    public String name;//名称

    public Menu(int order, String name){
        this.order = order;
        this.name = name;
    }

    public void show(){
        System.out.println(order + "." + name);
    }
}
