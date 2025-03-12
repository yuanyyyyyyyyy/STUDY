package chapter14.com.cyx.polymorphism.animal;

public class Tiger extends Animal {

    @Override
    public void eat(){
        System.out.println("老虎吃肉");
    }

    public void hunting(){
        System.out.println("老虎在捕猎");
    }   
}
