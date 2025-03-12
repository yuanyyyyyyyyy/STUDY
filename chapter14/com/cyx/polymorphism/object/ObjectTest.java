/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-12 16:02:48
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-12 16:15:05
 * @FilePath: /workspace/STUDY/chapter14/com/cyx/polymorphism/object/ObjectTest.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter14.com.cyx.polymorphism.object;
import chapter14.com.cyx.polymorphism.device.TV;

public class ObjectTest {

    public static void main(String[] args) {
        TV tv = new TV();
        Class clazz = tv.getClass();
        String name = clazz.getSimpleName();//获取类名
        System.out.println(name);
        String className = clazz.getName();//获取类的全限定名
        System.out.println(className);

        Class superClass = clazz.getSuperclass();//获取父类的定义信息
        String superName = superClass.getSimpleName();//获取父类的名称
        System.out.println(superName);
        String superClassName = superClass.getName();//获取父类的全限定名
        System.out.println(superClassName); 

        String s = "admin";
        Class stringClass = s.getClass();
        Class[] interfaceClasses = stringClass.getInterfaces();
        for(int i = 0;i < interfaceClasses.length;i++){
            Class interfaceClass = interfaceClasses[i];
            String interfaceName = interfaceClass.getSimpleName();//获取接口的名称
            System.out.println(interfaceName);

            String interfaceClassName = interfaceClass.getName();//获取接口的全限定名
            System.out.println(interfaceClassName);
        }
    }
}
