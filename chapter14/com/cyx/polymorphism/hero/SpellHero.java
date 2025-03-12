package chapter14.com.cyx.polymorphism.hero;

public class SpellHero extends Hero {

    public SpellHero(String name){
        super(name);
    }

    @Override
    public void attact(){
        System.out.println(name + "发动法术攻击");
    }
}
