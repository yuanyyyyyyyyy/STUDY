/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-10 13:38:12
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-10 13:39:14
 * @FilePath: /workspace/STUDY/chapter13/com/cyx/shape/Circle.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter13.com.cyx.shape;

public class Circle extends Shape{

    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public Double perimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public Double area(){
        return Math.PI*radius*radius;
    }
}
