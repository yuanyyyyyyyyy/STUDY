/**
 * @Author: yuanyou
 * @Date: 2025-03-10 04:05:41
 * @LastEditTime: 2025-03-10 04:07:02
 */
package chapter12.com.cyx.inheritance.shape;

public class Rectangle extends Shape{

    private int width;

    private int length;

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }

    //周长
    @Override
    public Integer calculateperimeter(){
        return (width + length) * 2;
    }

    //面积
    @Override
    public Integer calculateArea(){
        return width * length;
    }
}
