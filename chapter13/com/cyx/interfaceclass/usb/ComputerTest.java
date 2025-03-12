package chapter13.com.cyx.interfaceclass.usb;

public class ComputerTest {

    public static void main(String[] args){
        Computer computer = new Computer();
        computer.insertUsb(1, new Mouse());
    } 
}
