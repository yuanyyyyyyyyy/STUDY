package chapter13.com.cyx.interfaceclass.usb;

public class Mouse implements USB {

    @Override
    public void service(){
        System.out.println("鼠标已接入，可以开始移动光标了");
    }
}
