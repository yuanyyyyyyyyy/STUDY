package chapter14.com.cyx.polymorphism;

public class CalculatorTest {

    public static void main(String[] args) {
        
        Calculator c = new Calculator();
        Long result1 = c.calculate(1, 2);
        System.out.println(result1);

        double result2 = c.calculate(1.1, 2.2);
        System.out.println(result2);
    }
}
