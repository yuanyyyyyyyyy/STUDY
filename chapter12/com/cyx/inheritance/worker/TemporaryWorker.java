package chapter12.com.cyx.inheritance.worker;

public class TemporaryWorker extends Worker{

    public TemporaryWorker(String name, String number, String dept, double salary) {
        super(name, number, dept, salary);
    }

    @Override
    public void work(){
        System.out.println("临时工干一些较为轻松的话");
    }
}
