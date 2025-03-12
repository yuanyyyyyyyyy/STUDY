/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-03-12 09:37:44
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-03-12 09:39:53
 * @FilePath: /workspace/STUDY/chapter13/com/cyx/printer/Printer.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package chapter13.com.cyx.printer;

/**
 * 打印机
 */
public class Printer {

    private InkBox inkBox;

    private Paper paper;

    public Printer(){};

    public Printer(InkBox inkBox, Paper paper){
        this.inkBox = inkBox;
        this.paper = paper;
    }

    //getter and setter
    public InkBox getInkBox() {
        return inkBox;
    }

	public void setInkBox(InkBox inkBox) {
		this.inkBox = inkBox;
	}

	public Paper getPaper() {
		return paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

    public void print(){
        //print format 格式化打印不会换行  %s表示字符串占位  %d表示数字占位
        System.out.printf("打印机使用%s墨盒在%s纸张上打印\n", inkBox.getColor(), paper.getSize());

    }
    
}
