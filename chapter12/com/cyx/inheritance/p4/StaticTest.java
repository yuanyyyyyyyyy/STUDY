package chapter12.com.cyx.inheritance.p4;

public class StaticTest {
    
    public static void main(String[] args){
        StaticFather f = new StaticChild();
        f.show();
        StaticFather.show();
        StaticChild.show();
    }
}
