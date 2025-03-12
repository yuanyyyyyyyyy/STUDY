package chapter14.com.cyx.polymorphism.hero;

public class HeroTest {

    public static void main(String[] args) {
        Hero hero1 = new PhysicalHero("李白");
        hero1.attact();

        Hero hero2 = new SpellHero("安其拉");
        hero2.attact();
    }
}
