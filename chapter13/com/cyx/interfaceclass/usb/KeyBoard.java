/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-12 09:20:14
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-12 09:20:17
 * @FilePath: /workspace/STUDY/chapter13/com/cyx/interfaceclass/usb/KeyBoard.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter13.com.cyx.interfaceclass.usb;

public class KeyBoard implements USB{

    @Override
    public void service(){
        System.out.println("键盘已接入，可以开始打字了");
    }

}
