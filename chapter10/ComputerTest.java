
/**
 * @Author: yuanyou
 * @Date: 2025-03-07 10:08:41
 * @LastEditTime: 2025-03-07 10:08:44
 */


public class ComputerTest {
    /**
     * @param args
     */
    public static void main(String[] args){
        Computer c1 = new Computer();
        c1.brand = "联想";
        c1.type = "T430";
        c1.price = 5000;
        
        /**
         * 调用带参构造方法创建对象时，必须注意参数列表传递的值要与构造方法定义时的形式列表一一对应
         * 传递的参数是实参：也就是形式参数的一个具体实例 
         */
        Computer c4 = new Computer("联想", "T430", 5000);
        updateComputer(c4);
        System.out.println(c4.price);;

        Computer c2 = new Computer();
        c2.brand = "联想";
        c2.type = "W530";
        c2.price = 6000;
        Computer c5= new Computer("联想","W530",6000);
        
        Computer c3 = new Computer();
        c3.brand = "联想";
        c3.type = "T450";
        c3.price = 7000;
        Computer c6 = new Computer("联想","T450",7000);

        
    }

    public static void updateComputer(Computer computer){
        computer.price = 100000;
    }
}
