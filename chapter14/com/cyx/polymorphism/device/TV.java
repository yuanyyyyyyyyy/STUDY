/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-12 12:23:38
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-12 12:25:11
 * @FilePath: /workspace/STUDY/chapter14/com/cyx/polymorphism/device/TV.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter14.com.cyx.polymorphism.device;

/**
 * 电视
 */
public class TV extends Device{

    @Override
    public void show() {
        System.out.println("这是长虹电视机");
    }   

    public void playVideo(){
        System.out.println("正在播放视频");
    }
}
