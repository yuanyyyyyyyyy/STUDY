package chapter19.com.cyx.inner.clazz.lambda;

public class CalculateTest {

    public static void main(String[] args) {
        // Calculate calculte = new Calculate(){
        //     @Override
        //     public int sum(int a, int b) {
        //         return a + b;
        //     }
        // };

            Calculate calculate = (int a, int b) -> {
                return a + b;
            };
            int result = calculate.sum(1, 4);
            System.out.println(result);
    }
}
