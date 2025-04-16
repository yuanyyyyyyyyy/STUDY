/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-15 06:10:58
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-15 06:30:51
 * @FilePath: /workspace/STUDY/chapter21/com/cyx/collection/ArrayUtil.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter21.com.cyx.collection.arrayutil;

import java.util.Arrays;

/**
 * 使用数组实现增删改查
 */
public class ArrayUtil {

    /**
     * 使用数组来存储数据，因为不知道存储什么样的数据，所以使用Object数组
     * 支持存储所有类型的数据
     */
    private Object[] elements;

    private int size;//数组中存储的元素个数

    public ArrayUtil(int capacity){
        elements = new Object[capacity];
    }

    public ArrayUtil() {
        
    }

    public int size(){
        return size;
    }

    public void add(Object o){
        //数组中存储满了，数组需要扩容存储新的元素
        if(size == elements.length){
            int length = elements.length + elements.length >> 1;
            elements = Arrays.copyOf(elements, length);
        }

        elements[size++] = o;
    }

    public void delete(Object o){
        if(o == null) return;
        int index = -1;//要删除的元素下标
        for(int i = 0; i < size; i++){
            if(o.equals(elements[i])){
                index = i;
                break;
            }
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
    }

    public void update(int index, Object o){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("数组下标越界"); 
        }

        elements[index] = o;
    }

    public Object get(int index){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("数组下标越界"); 
        }

        return elements[index];
    }
}
