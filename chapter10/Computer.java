/**
 * 计算机
 * @Author: yuanyou
 * @Date: 2025-03-07 10:05:49
 * @LastEditTime: 2025-03-07 10:07:39
 */


public class Computer {
    public String brand;//品牌
    public String type;//型号
    public double price;//价格

    /**
     * 如果一个类中没有定义任何构造方法，那么编译器会自动为这个类添加一个默认的无参构造方法
     * 如果一个类中定义了构造方法，那么编译器不会为这个类添加默认的无参构造方法
     * 如果在一个类中已经定义了带参数的构造方法，此时还想使用无参构造方法，那么必须自己定义一个无参构造方法
     */
    public Computer(){}

    /**
     * 此时在类中定义了带参数的构造方法，那么编译器不会为这个类添加默认的无参构造方法
     * 构造方法的()表示的是参数列表，这里的列表是形式参数
     */
    public Computer(String brand, String type, double price){
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

}
