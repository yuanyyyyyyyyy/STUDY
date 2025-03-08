/**
 * @Author: yuanyou
 * @Date: 2025-03-07 14:55:11
 * @LastEditTime: 2025-03-07 14:55:13
 */
public class NumberUtilTest {
    public static void main(String[] args) {
        NumberUtil util = new NumberUtil();
        int result = util.factorial(6);
        System.out.println(result);

        boolean prime = util.isPrime(7);
        System.out.println(prime);
        }
        
}
