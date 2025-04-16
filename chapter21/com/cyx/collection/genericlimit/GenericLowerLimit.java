/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-15 11:45:37
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-15 11:49:53
 * @FilePath: /workspace/STUDY/chapter21/com/cyx/collection/genericlimit/GenericLowerLimit.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter21.com.cyx.collection.genericlimit;

import chapter21.com.cyx.collection.mycollection.Mycollection;

/**
 * 泛型下限
 * 在使用泛型时，可以设置泛型的下限，表示只能接受该类型及其子类或该类型的父类。
 * 当集合使用泛型下限时，因为编译器知道存储类型的下限，至少可以将该类型对象存入，
 * 但不知道有存储的数据有多少种父类，因此，该集合只能存储元素，不能读取元素。
 */
public class GenericLowerLimit {

    public static void main(String[] args) {
        //集合中存储的类型可以是Number的子类、Number类、Number的父类
        Mycollection<? super Number> c = new Mycollection<>();
        //虽然存储元素的类型可以是Number的父类，但是由于父类类型无法确定具体多少种，
        //因此在使用添加功能时，编译器会报错
        //c.add(new Object());
        //但是集合中可以存储Number类
        c.add(1.0);
    }

}
