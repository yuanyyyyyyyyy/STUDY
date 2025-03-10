/**
 * @Author: yuanyou
 * @Date: 2025-03-09 13:04:24
 * @LastEditTime: 2025-03-09 13:04:27
 */
package chapter12.com.cyx.inheritance.p2;

public class Programmer extends Person{
    public int level;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

    public void writeCode(){
        System.out.println("程序员写代码");
    }
}
