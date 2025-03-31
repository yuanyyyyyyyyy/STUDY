/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-31 06:50:11
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-31 07:09:38
 * @FilePath: /workspace/STUDY/chapter17/com/cyx/file/Example6.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter17.com.cyx.file;
/**
 * 使用递归求1-100的累加和
 * 几个递归小练习
 */
import java.io.File;
public class Example6 {

    public static void main(String[] args){
        int result = sum(100);
        System.out.println(result);
    }

    public static int sum(int number){
        if(number == 1){
            return 1;
        }

        return number + sum(number - 1);
    }

    //使用递归打印文件夹下所有文件信息
    public static void recursiveFolder(File folder){
        if(folder.isDirectory()){//检测是否是文件夹
            File[] files = folder.listFiles();
            for(File file: files){
                if(file.isDirectory()){//如果是文件夹，就在调用方法进行查看
                        recursiveFolder(file);
                }else{
                    System.out.println(file.getPath());
                }
            }
        }else{//不是文件夹，就直接打印文件的路径
            System.out.println(folder.getPath());
        }
    }

    //使用递归求6的阶乘
    public static int multiply(int number){
        if(number == 1 || number == 0) return 1;

        return number * multiply(number - 1);
    }

    //删除一个文件夹
    public static void deleteFolder(File folder){
        if(folder.isDirectory()){//是文件夹就需要再进去看
            File[] files = folder.listFiles();
            if(files != null){
                for(File file: files){
                    if(file.isDirectory()){//是文件夹，继续递归进去看
                        deleteFolder(file);
                    }else{
                        file.delete();//是文件，直接删除
                    }
                }
            }
        }else{//不是文件夹，直接删除
            folder.delete();
        }
    }
}
