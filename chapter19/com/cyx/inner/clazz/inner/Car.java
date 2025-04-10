/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-09 02:25:44
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-09 03:07:49
 * @FilePath: /workspace/STUDY/chapter18/chapter19/com/cyx/inner/clazz/inner/Car.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter19.com.cyx.inner.clazz.inner;
/**
 * 使用内部类描述一辆汽车拥有一台发动机
 */
public class Car {//汽车  外部类

    private double price;

    private String brand;

    private Engine engine;//汽车拥有的发动机  内部类

    public Car(double price, String brand) {
        this.brand = brand;
        this.engine = new Engine("国产", 20000);
        this.price = price + engine.price;
    }

    public Car(Engine engine, String brand, double price) {
        this.price = price + engine.price;
        this.brand = brand;
        this.engine = engine;
        
    }

    public void show(){
        this.engine.show();
    }

    class Engine{//发动机  内部类

        private String type;//发动机类型

        private double price;//发动机价格

        public Engine(String type, double price) {
            this.type = type;
            this.price = price;
        }

        public void show(){
            System.out.println(brand + "汽车使用的是" + type + "发动机，价格为：" + price);
            //如果内部类中存在外部类同名的成员变量时，想要使用外部类的同名成员变量，需要加上：外部类类名.this.变量名
            System.out.println("汽车的价格为：" + Car.this.price);
        }
    }
}
