package chapter16.com.cyx.exercise;

import java.util.Scanner;
public class Exercise2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        double money = sc.nextDouble();
        StringBuilder builder = new StringBuilder();
        builder.append(money);
        //找到小数点的位置
        int index = builder.indexOf(".");
        //小数点前面的数字才需要处理
        if(index > 3){
            for(int i = index - 3; i > 0; i-=3){
                builder.insert(i, ",");
            }
        }

        System.out.println(builder.toString());
    }
}
