package chapter14.com.cyx.polymorphism.device;

/**
 * 空调
 */
public class AirConditioning extends Device{

    @Override
    public void show() {
        System.out.println("这是格力空调");
    }

    public void airColder(){
        System.out.println("正在制冷");
    }

}
