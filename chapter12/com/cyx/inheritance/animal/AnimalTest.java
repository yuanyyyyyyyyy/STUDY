package chapter12.com.cyx.inheritance.animal;

public class AnimalTest {

    public static void main(String[] args){

        Animal a1 = new Dog("旺财", 1);
        a1.eat();
        a1.sleep();

        Animal a2 = new Horse("马儿", 2);
        a2.eat();
        a2.sleep();
    }
}
