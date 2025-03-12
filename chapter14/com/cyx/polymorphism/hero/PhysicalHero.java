package chapter14.com.cyx.polymorphism.hero;

public class PhysicalHero extends Hero{

    public PhysicalHero(String name){
        super(name);
    }

    @Override
    public void attact(){
        System.out.println(name + "发动物理攻击");
    }
}
