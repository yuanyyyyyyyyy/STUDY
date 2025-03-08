/**
 * @Author: yuanyou
 * @Date: 2025-03-07 15:07:34
 * @LastEditTime: 2025-03-07 15:07:37
 */
public class MenuTest {
    
    public static void main(String[] args){
        Menu[] menus = new Menu[3];

        menus[0] = new Menu(1, "增加学生信息");
        menus[1] = new Menu(2, "删除学生信息");
        menus[2] = new Menu(3, "修改学生信息");
    }
}
