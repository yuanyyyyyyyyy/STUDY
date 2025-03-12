package chapter13.com.cyx.interfaceclass.person;
/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-12 08:51:33
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-12 08:58:25
 * @FilePath: /workspace/STUDY/chapter13/com/cyx/interfaceclass/person/Entertainmentstar.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
public class Entertainmentstar implements Atrist{

    private String name;

    public Entertainmentstar(String name){
        this.name = name;
    }
    @Override
    public void endorsement(){
        System.out.printf("娱乐明星%s代言\n", getName());
    }

    @Override
    public void performance(){
        System.out.printf("娱乐明星%s表演\n", getName());
    }

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void sing() {
		System.out.printf("娱乐明星%s唱歌\n", getName());
	}
}
