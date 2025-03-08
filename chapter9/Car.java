/*
 * @Author: yuanyou
 * @Date: 2025-03-05 12:38:19
 */
public class Car {
    public String brand;//品牌
    public String type;//型号
    public double price;//价格

    public Car(){
        this.brand = "默认品牌";
        this.type = "默认型号";
        this.price = 41111;
    }

    public void start(){
        System.out.println("汽车启动");
    }

    public void speedup(){
        System.out.println("汽车加速");
    }

    public void stop(){
        System.out.println("汽车刹车");
    }

    public void show(){
        //String name;//局部变量，没有初始值
        String brand = "奔驰";
        System.out.println(this.brand + "\t" + type + "\t" + price);
    }
}
