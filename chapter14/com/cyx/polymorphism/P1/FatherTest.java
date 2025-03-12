package chapter14.com.cyx.polymorphism.P1;

public class FatherTest {

    public static void main(String[] args) {
        //变量f的类型是father
        Father f = new Child();
        //f调用show()时， 不会调用Father定义的方法
        f.show();//Child Show
    }
}
