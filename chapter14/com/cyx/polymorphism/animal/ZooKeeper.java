package chapter14.com.cyx.polymorphism.animal;

/**
 * 动物管理员
 */
public class ZooKeeper {

    // public void feedTiger(Tiger tiger){
    //     tiger.eat();
    // }

    // public void feedPanda(Panda panda){
    //     panda.eat();
    // }

    // public void feedMonkey(Monkey monkey){
    //     monkey.eat();
    // }

    public void feedAnimal(Animal animal){
        animal.eat();
    }
}
