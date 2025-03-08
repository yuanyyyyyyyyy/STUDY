import java.util.Arrays;

/**
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-08 08:05:47
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-08 08:05:51
*/
public class ArraySort {
    public static void main(String[] args){
        int[] arr1 = {80,72,85,67,50,76,95,49};
        int[] arr2 = {77,90,92,89,67,94};
        int[] arr3 = {99,87,95,93,88,78,85};

        sortdesc(arr1);
        System.out.println(Arrays.toString(arr1));
        sortdesc(arr2);
        System.out.println(Arrays.toString(arr2));
        sortdesc(arr3);
        System.out.println(Arrays.toString(arr3));
        
    }

    public static void sortdesc(int[] arr){
        //可以使用冒泡排序来对数组中的元素进行降序排列
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr.length - i - 1;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
