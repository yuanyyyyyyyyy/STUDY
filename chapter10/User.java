/**
 * @Author: yuanyou
 * @Date: 2025-03-08 11:59:43
 * @LastEditTime: 2025-03-08 11:59:48
 */

/**
 * a.该过程涉及到的对象(事物)有两个:用户(User)和菜单(Menu)
 * b.用户(User)拥有执行 增删改查 成绩的动作
 */
public class User {
    public void addScore(){
        System.out.println("你选择了增加成绩");
    }

    public void deleteScore(){
        System.out.println("你选择了删除成绩");
    }

    public void updateScore(){
        System.out.println("你选择了修改成绩");
    }

    public void searchScore(){
        System.out.println("你选择了查询成绩");
    }
}
