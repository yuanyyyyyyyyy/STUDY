package chapter14.com.cyx.polymorphism;

public class Calculator {

    //方法重载
    //编译时多态
    public double calculate(double a, double b){
        return a + b;
    }

    public long calculate(long a, long b){
        return a + b;
    }
}
