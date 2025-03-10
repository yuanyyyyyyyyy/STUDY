/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-10 07:17:14
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-10 07:25:05
 * @FilePath: /workspace/STUDY/chapter12/com/cyx/inheritance/worker/InteriorWorker.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter12.com.cyx.inheritance.worker;

public class InteriorWorker extends Worker{
    
    public InteriorWorker(String name, String number, String dept, double salary) {
        super(name, number, dept, salary);
    }

    @Override
    public void work(){
        System.out.println("内部员工干一些较为粗重的话");
    }
}
