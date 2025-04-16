/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-15 07:05:22
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-15 11:44:17
 * @FilePath: /workspace/STUDY/chapter21/com/cyx/collection/MycollectionTest.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter21.com.cyx.collection.mycollection;

/**
 * 在JDK7及以上版本，new 对象时如果类型带有泛型，可以不写具体的泛型。
 * 在JDK7以下版本，在new 对象时如果类型带有泛型，必须写具体的泛型。
 */
public class MycollectionTest {

    public static void main(String[] args) {
        Mycollection<String> c = new Mycollection<>();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        c.add("e");

        Mycollection<String> c1 = new Mycollection<>();
        c1.add("b");
        c1.add("c");
        c1.add("d");

        boolean contains1 = c.containsAll(c1);//判断集合是否都包含给定集合中的所有元素
        System.out.println(contains1);

        Mycollection<Integer> c2 = new Mycollection<>();
        c2.add(1);
        c2.add(2);
        c2.add(3);
        boolean contains2 = c.containsAll(c2);
        System.out.println(contains2);

        //泛型使用通配符的集合不能存储数据，只能读取数据
        Mycollection<?> c3 = new Mycollection<>();
        // c3.add(1);
        // c3.add("");


        
        // System.out.println("集合大小为：" + collection.size());

        // //遍历方式一
        // Iterator iterator = collection.iterator();
        // while(iterator.hasNext()){
        //     String s = (String)iterator.next();
        //     System.out.println(s);
        // }
        // System.out.println("=================");
        // collection.remove("a");
        // System.out.println("集合大小为：" + collection.size());

        // //遍历方式2
        // for(Object o: collection){
        //     System.out.println(o);
        // }
        // boolean exists = collection.contains("c");
        // System.out.println("集合中是否包含c：" + exists);

        // Mycollection c = new Mycollection();
        // c.add(5);
        // c.add(4);
        // c.add(3);
        // c.add(2);
        // c.add(1);
        // //遍历方式
        // for(Iterator iter = c.iterator(); iter.hasNext();){
        //     Integer i = (Integer)iter.next();
        //     System.out.println(i);
        // }

        // Mycollection<String> c2 = new Mycollection<>();
        // c2.add("admin");
        // c2.add("user");
        // for(Iterator<String> iter = c2.iterator(); iter.hasNext();){
        //     String i = iter.next();
        //     System.out.println(i);
        // }

        // //当创建Mycollection对象没有使用泛型时，默认是Object类型
        // Mycollection c1 = new Mycollection();
        // c1.add(5);
        // c1.add(4.0);
        // c1.add("3");
        // c1.add(2.0f);
        // c1.add(new Object());
        // for(Iterator iter = c1.iterator(); iter.hasNext();){
        //     Object i = iter.next();
        //     System.out.println(i);
        // }
    }   

}
