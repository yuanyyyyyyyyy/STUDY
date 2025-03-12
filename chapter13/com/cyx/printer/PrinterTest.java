package chapter13.com.cyx.printer;

public class PrinterTest {

    public static void main(String[] args){

        Printer p1 = new Printer();
        p1.setInkBox(new ColorInkBox());
        p1.setPaper(new A4Paper());
        p1.print();

        Printer p2 = new Printer(new BlackInkBox(), new A2Paper()); 
        p2.print();
    }
}
