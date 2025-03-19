package chapter15.com.cyx.exception;

public class Child extends Father{

    private String username;

    private String password;

    public Child(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void eat() throws UsernamenotFoundException{

    }

    //父类中的方法没有声明抛出异常，子类中方法 可以 声明抛出 运行时异常
    @Override
    public void sleep() throws RuntimeException{

    }

    //父类中的方法没有声明抛出异常，子类中方法 不能 声明抛出 检查异常
    @Override
    public void login(){
        try{
            Login.login(username, password);
        }catch(UsernamenotFoundException e){
            e.printStackTrace();
        }catch(BadCredentialsException e){
            e.printStackTrace();
        }
    }

}
