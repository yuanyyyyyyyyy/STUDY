package chapter13.com.cyx.interfaceclass.person;

public class PersonTest {

    public static void main(String[] args){

        Person p = new Entertainmentstar("刘德华");//娱乐明星是人
        System.out.println(p.getName());

        Actor a = new Entertainmentstar("范冰冰");//娱乐明星也是演员
        a.performance();//表演

        Singer s = new Entertainmentstar("张学友");//娱乐明星也是歌手
        s.sing();//唱歌

        Atrist artist = new Entertainmentstar("周杰伦");//娱乐明星也是艺人
        artist.endorsement();//代言
        artist.performance();//表演
        artist.sing();//唱歌
    }
}
