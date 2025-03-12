package chapter13.com.cyx.interfaceclass.usb;

public class UDisk implements USB{

    @Override
    public void service() {
        System.out.println("U盘已接入，可以存储数据了");
    }
}
