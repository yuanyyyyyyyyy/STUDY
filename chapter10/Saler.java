/**
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-07 16:05:07
 * @LastEditTime: 2025-03-07 16:16:43
 */
public class Saler {
    
    public Mobile[] mobiles = new Mobile[100];

    //引用数据类型作为方法的参数
    public void playMobile(Mobile mobile){
        for(int i = 0; i < mobiles.length; i++){
            if(mobiles[i] == null){
                mobiles[i] = mobile;
                break;
            }
        }
    }
}
