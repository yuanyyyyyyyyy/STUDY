/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-12 12:33:10
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-12 12:34:34
 * @FilePath: /workspace/STUDY/chapter14/com/cyx/polymorphism/device/DeviceTest.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter14.com.cyx.polymorphism.device;

public class DeviceTest {

    public static void main(String[] args) {
        
        QualityInspection qi = new QualityInspection();
        qi.test(new TV());
        qi.test(new ElectronicFan());
        qi.test(new AirConditioning()); 
    }
}
