/**
 * @Author: yuanyou
 * @Date: 2025-03-09 13:08:59
 * @LastEditTime: 2025-03-09 13:09:02
 */
package chapter12.com.cyx.inheritance.p2;

public class Doctor extends Person {

    private String professional;

    public String getProfessional(){
        return professional;
    }

    public void setProfessional(String professional){
        this.professional = professional;
    }

    public void cure(){
        System.out.println("医生治病");
    }

    public void eat(){
        System.out.println("医生吃饭");
    }

    //public Number getScore(){
    //    return 10;
    //}

    //子类重写父类方法时，返回值类型 可以是 父类方法的 返回值类型的子类
    //协变返回类型

    @Override //该注解告诉编译器，这是一个重写的方法，编译器会去检测父类中是否存在这样的方法，如果不存在，则将生成一个错误
    public Integer getScore(){
        return 10;
    }
}
