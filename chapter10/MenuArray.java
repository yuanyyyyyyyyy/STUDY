/**
 * @Author: yuanyou
 * @Date: 2025-03-08 08:20:52
 * @LastEditTime: 2025-03-08 08:20:56
 */
public class MenuArray {
    
    /**
     * @param args
     */
    public static void main(String[] args){
        Menu[] mainMenus = {
            new Menu(1, "学生成绩管理"),
            new Menu(2, "学生选课管理"),
            new Menu(3, "退出系统")
        };

        Menu[] secondMenus = {
            new Menu(1, "增加成绩"),
            new Menu(2, "删除成绩"),
            new Menu(3, "修改成绩"),
            new Menu(4, "查询成绩"),
            new Menu(5, "返回主菜单")
        };

        showMenus(mainMenus);
        showMenus(secondMenus);

    }

    public static void showMenus(Menu[] menus){
        for(int i = 0; i < menus.length; i++){
            menus[i].show();
        }
    }
}
