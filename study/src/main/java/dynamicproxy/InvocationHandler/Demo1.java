package dynamicproxy.InvocationHandler;

public class Demo1 implements IMyDemo {

    @Override
    public void getName() {

        System.out.println("getname");
    }

    @Override
    public void getName1() {

        System.out.println("getname");

    }

}
