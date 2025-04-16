/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-15 11:33:55
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-15 11:44:52
 * @FilePath: /workspace/STUDY/chapter21/com/cyx/collection/GenericUpperLimit.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter21.com.cyx.collection.genericlimit;

import chapter21.com.cyx.collection.mycollection.Mycollection;

/**
 * 泛型上限
 * 在使用泛型时，可以设置泛型的上限，表示只能接受该类型或其子类。
 * 当集合使用泛型上限时，因为编译器只知道存储类型的上限，但不知道具体存的是什么类型，
 * 因此，该集合不能存储元素，只能读取元素
 */
public class GenericUpperLimit {

    //定义了一个泛型上限为Number的集合 Integer Double Short Byte Float Long
    Mycollection<? extends Number> c = new Mycollection<>();
    /**
     * 添加元素的时候，使用的是占位符？extends Number来对泛型变量进行替换时，
     * 无法确定该参数应该怎么来匹配？ extends Number表示的是Number的子类，因此不能存入数据
     */

    // c.add((Integer)1);
    // c.add(1.0);
}
