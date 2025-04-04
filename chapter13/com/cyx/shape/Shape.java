/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-10 13:33:40
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-10 13:33:43
 * @FilePath: /workspace/STUDY/chapter13/com/cyx/shape/Shape.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter13.com.cyx.shape;

public abstract class Shape {

    public abstract Number perimeter();//知道几何图形能算周长，但不知道怎么算

    public abstract Number area();//知道几何图形能算面积，但不知道怎么算
}
