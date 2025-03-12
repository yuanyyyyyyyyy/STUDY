package chapter14.com.cyx.polymorphism.animal;

public class Panda extends Animal{

    @Override
    public void eat(){
        System.out.println("熊猫吃竹子");
    }

    public void sleeping(){
        System.out.println("熊猫在睡觉");
    }   
}
