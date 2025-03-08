
/**
 * @Author: yuanyou
 * @Date: 2025-03-05 09:48:08
 */

/*
定义一个计算器类，计算器能够对两个数字进行加减乘除。
分析
a. 计算器能够接收两个数字和一个运算符
b.计算器能够进行计算
 */

public class Calculator {
    public double number1;//接受的数字1
    public double number2;//接受的数字2
    public String operator;//接受的运算符

    public Calculator(int i, int j, String string) {
    }

    public Calculator() {
    }

    //计算
    public int calculate(){
        switch(operator){
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
        }
        return 0;
    }

    public int calculator(int total, int i, String string) {
        return 0;
    }
}
