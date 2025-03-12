package chapter14.com.cyx.polymorphism.animal;

public class Monkey extends Animal{

    @Override
    public void eat(){
        System.out.println("猴子吃香蕉");
    }

    public void climbing(){
        System.out.println("猴子在爬树");
    }
}
