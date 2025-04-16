/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-15 06:45:20
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-15 11:12:09
 * @FilePath: /workspace/STUDY/chapter21/com/cyx/collection/Mycollection.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter21.com.cyx.collection.mycollection;

/**
 * 自定义Collection集合
 */
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 定义了泛型变量T，在使用Mycollection创建对象的时候，就需要使用具体的数据类型来替换泛型变量
 */
public class Mycollection<T> extends AbstractCollection<T>{

    private Object[] elements;

    private int size;

    public Mycollection(){
        this(16);
    }

    public Mycollection(int capacity){
        elements = new Object[capacity];
    }

    @Override
    public boolean add(T o){
        //数组中存储满了，数组需要扩容才能存储新的元素
        if(size == elements.length){
            int length = elements.length + elements.length >> 1;
            elements = Arrays.copyOf(elements, length);
        }
        elements[size++] = o;
        return true;
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public Iterator<T> iterator(){
        return new CollectionIterator();
    }

    class CollectionIterator implements Iterator<T>{

        private int cursor;//光标，实际上就是下标
        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public T next() {
            if(cursor >= size || cursor < 0){
                throw new IndexOutOfBoundsException("下标越界了");
            }
            return (T)elements[cursor++];
        }

        @Override
        public void remove(){
            if(cursor >= size || cursor < 0){
                throw new IndexOutOfBoundsException("下标越界了");
            }
            System.arraycopy(elements, cursor, elements, cursor - 1, size - cursor);
            
            if(cursor == size){//表示移除的是最后一个元素，光标就会向前移动一位
                cursor--;
            }
            size--;//存储个数-1
        }

    }
}
