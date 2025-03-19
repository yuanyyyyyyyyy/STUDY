package chapter16.com.cyx.builder;

/**
 * 删除指定区间存储的内容
 * 删除存储区指定下标位置存储的字符
 */
public class Example3 {

    public static void main(String[] args){
        StringBuilder builder = new StringBuilder("abcdefg");
        builder.delete(1, 5);//[1, 5) 将StringBuiler存储区指定的开始位置到指定的结束位置之间的内容删除掉
        System.out.println(builder);//afg

        builder.deleteCharAt(0);//删除存储区指定下标存储的字符
        System.out.println(builder);//fg
    }
}
