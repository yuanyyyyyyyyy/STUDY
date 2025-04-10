/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-09 03:31:57
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-09 03:43:52
 * @FilePath: /workspace/STUDY/chapter18/chapter19/com/cyx/inner/clazz/anonymous/AnonymousClass.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter19.com.cyx.inner.clazz.anonymous;

public class AnonymousClass {

    public static void main(String[] args) {
        int result = calculate(10, 20);
        System.out.println(result);

        // class Tiger extends Animal{
        //     @Override
        //     public void eat(){
        //         System.out.println("老虎吃肉");
        //     }
        // }
        // Animal tiger = new Tiger();
        // tiger.eat();

        Animal a = new Animal(){
            @Override
            public void eat(){
                System.out.println("老虎吃肉");
            }
        };
        a.eat();

    }

    public static int calculate(int a, int b){
        //1.
        // class Calculator implements Calculate{
        //     @Override
        //     public int calculate(int a, int b){
        //         return a + b;
        //     }
        // }
        // Calculate calculate = new Calculator();

        //2.
        // Calculate calculate = new Calculate(){
        //     @Override
        //     public int calculate(int a, int b){
        //         return a + b;
        //     }
        // };

        //3.
        //匿名内部类跟构造方法的调用很相似，不同的地方在于：匿名内部类里面还有类的主体
        Calculate c = new Calculate(){
            @Override
            public int calculate(int a, int b){
                return a + b;
            }
        };

        return c.calculate(a, b);
    }
}
