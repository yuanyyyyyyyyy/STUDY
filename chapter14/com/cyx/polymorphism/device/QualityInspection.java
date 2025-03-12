/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-12 12:28:55
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-12 12:30:06
 * @FilePath: /workspace/STUDY/chapter14/com/cyx/polymorphism/device/QualityInspection.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter14.com.cyx.polymorphism.device;

/**
 * 质检
 */
public class QualityInspection {

    public void test(Device device){
        device.show();

        if(device instanceof TV){
            ((TV)device).playVideo();
        }else if(device instanceof ElectronicFan){
            ((ElectronicFan)device).start();
        }else if(device instanceof AirConditioning){
            ((AirConditioning)device).airColder();
        }
    }
}
