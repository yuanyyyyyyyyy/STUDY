package chapter12.com.cyx.inheritance.shape;

public class ShapeTest {

    public static void main(String[] args){

        Shape s1 = new Rectangle(10, 3);
        System.out.println(s1.calculateperimeter());
        System.out.println(s1.calculateArea());

        Shape s2 = new Circle(10);
        System.out.println(s2.calculateperimeter());
        System.out.println(s2.calculateArea());
    }
}
