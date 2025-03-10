/**
 * @Author: yuanyou
 * @Date: 2025-03-10 04:06:09
 * @LastEditTime: 2025-03-10 04:06:12
 */
package chapter12.com.cyx.inheritance.shape;

public class Circle extends Shape{

    private int radius;

    public Circle(int radius){
        this.radius= radius;
    }

    //周长
    @Override
    public Double calculateperimeter(){
        return 2 * Math.PI * radius;
    }

    //面积
    @Override
    public Double calculateArea(){
        return Math.PI * radius *radius;
    }
}
