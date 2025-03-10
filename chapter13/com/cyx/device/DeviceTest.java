/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-10 13:31:19
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-10 13:32:59
 * @FilePath: /workspace/STUDY/chapter13/com/cyx/device/DeviceTest.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter13.com.cyx.device;

public class DeviceTest {
    
    public static void main(String[] args){
        Device d1 = new TV();
        d1.work();

        Device d2 = new ElextreonicFan();
        d2.work();
    }
}
