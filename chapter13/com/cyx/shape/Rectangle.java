/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-10 13:35:45
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-10 13:37:56
 * @FilePath: /workspace/STUDY/chapter13/com/cyx/shape/Rectangle.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter13.com.cyx.shape;

public class Rectangle extends Shape{

    private int width;

    private int length;

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }

    @Override
    public Integer perimeter(){
        return 2*(width+length);
    }

    @Override
    public Integer area(){
        return width*length;
    }
}
