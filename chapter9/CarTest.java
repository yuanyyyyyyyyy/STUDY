/*
 * @Author: yuanyou
 * @Date: 2025-03-05 12:42:16
 */
public class CarTest {
    
    public static void main(String[] args){
        Car c = new Car();//this -> c
        c.show();
        c.brand = "BBB";
        c.type = "A8";
        c.price = 1000000;
        c.show();

        Car c1 = new Car();//this -> c1
        c1.brand = "CCC";
        c1.type = "A8";
        c1.price = 1000000;
        c1.show();
    }
}
