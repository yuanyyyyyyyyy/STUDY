package chapter13.com.cyx.interfaceclass.usb;

public class Computer {

    private USB[] usbArr = new USB[4];//一台电脑拥有4个USB接口

    public void insertUsb(int index, USB usb){
        if(index < 0 || index > usbArr.length){
            System.out.println("插入位置不合法，请不要瞎搞");
        }else{
            usbArr[index] = usb;
            usb.service();
        }
    }
}
