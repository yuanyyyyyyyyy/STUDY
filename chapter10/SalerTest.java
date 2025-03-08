/**
 * @Author: yuanyou
 * @Date: 2025-03-07 16:11:13
 * @LastEditTime: 2025-03-07 16:16:17
 */
public class SalerTest {
    
    public static void main(String[] args){
        Saler saler = new Saler();
        //调用售货员放手机
        saler.playMobile(new Mobile("小米", "小米10", 13243));
    }
}
