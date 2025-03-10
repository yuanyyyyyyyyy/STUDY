package chapter12.com.cyx.inheritance.worker;

public class WorkerTest {

    public static void main(String[] args){

        Worker w1 = new InteriorWorker("张三", "1001", "人事部", 10000);
        w1.work();

        Worker w2 = new TemporaryWorker("李四", "1002", "人事部", 10000);
        w2.work();
    }
}
