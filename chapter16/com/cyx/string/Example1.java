package chapter16.com.cyx.string;

public class Example1 {

    public static void main(String[] args){
        //当时用一个字面量给字符串赋值时，首先会去字符串常量池中检测是否存在这个字面量。
        //如果存在，则直接使用这个字面量的地址赋值即可。
        //如果不存在，则需要在字符串常量池中创建这个字面量，然后再将地址赋值过去即可
        String s = "超用心";
        s += "在线教育"; //这里的字符串拼接动作发生在堆内存中
        System.out.println(s);
    }
}
