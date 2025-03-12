package chapter14.com.cyx.polymorphism.device;

/**
 * 电风扇
 */
public class ElectronicFan extends Device{

    @Override
    public void show() {
        System.out.println("这是美的电风扇");
    }

    public void start(){
        System.out.println("正在启动");
    }
}
