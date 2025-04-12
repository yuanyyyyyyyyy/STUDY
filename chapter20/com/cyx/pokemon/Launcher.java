/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-11 13:20:50
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-12 02:15:13
 * @FilePath: /workspace/STUDY/chapter20/com/cyx/pokemon/Launcher.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter20.com.cyx.pokemon;

/**
 * 启动类
 * 
 * 编写启动类，冒险家开始闯关，检测显示是否正常
 */
public class Launcher {

    public static void main(String[] args) {
        Adventurer adventurer = new Adventurer();
        adventurer.start();
    }
}
