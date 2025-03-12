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

        if(animal instanceof Tiger){//如果animal对象是一个Tiger类的实例
            ((Tiger)animal).hunting();
        }else if(animal instanceof Panda){//如果animal对象是一个Panda类的实例
            ((Panda)animal).sleeping();
        }else if(animal instanceof Monkey){//如果animal对象是一个Monkey类的实例
            ((Monkey)animal).climbing();
        }
    }
}
