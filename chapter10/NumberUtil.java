/**
 * @Author: yuanyou
 * @Date: 2025-03-07 14:51:43
 * @LastEditTime: 2025-03-07 14:55:59
*/
public class NumberUtil {
    //阶乘： 6! = 6 x 5 x 4 x 3 x 2 x 1
    public int factorial(int number){
        if(number == 0) return 1;
        int result = 1;
        for(int i=1; i<= number; i++){
            result = result * i;
        }
        return result;
    }

    /**
    * 素数特征：只能被1和本身整除。换言之，也就是从2开始，到这个数本身-1为止，如果存在任意一个数能够该数被整除，那么说明该数不是素数
    * @param number
    * @return
    */
    public boolean isPrime(int number){
        if(number == 2) return true;
        for(int i=2; i<number; i++){
        //if选择结构中，如果其后只有一条语句或者一个结构体，那么{}可以省略。
            if(number % i == 0) return false;
        }
        return true;
    }

    
}
