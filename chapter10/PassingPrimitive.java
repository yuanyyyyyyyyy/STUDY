/**
 * @Author: yuanyou
 * @Date: 2025-03-08 08:58:29
 * @LastEditTime: 2025-03-08 08:58:38
 */
public class PassingPrimitive {
    
    public static void main(String[] args){
        int a = 10;
        change(a);//调用方法时，实际上传递的是变量a的值的拷贝
        System.out.println(a);;
    }

    public static void change(int number){
        number++;
    }
}
