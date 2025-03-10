package chapter13.com.cyx.shape;

public class ShapeTest {

    public static void main(String[] args) {
        
        Shape s1 = new Rectangle(2, 6);
        System.out.println(s1.perimeter());
        System.out.println(s1.area());

        Shape s2 = new Circle(3);
        System.out.println(s2.perimeter());
        System.out.println(s2.area());
    }
}
