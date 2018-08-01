package dynamicproxy.InvocationHandler;

import java.lang.reflect.Proxy;


public class Start {

    public static void main(String[] args) {

        IMyDemo demo1 = new Demo1();

        MyInvocationHandler handler = new MyInvocationHandler(demo1);

        IMyDemo obj = (IMyDemo) Proxy.newProxyInstance(Demo1.class.getClassLoader(), Demo1.class.getInterfaces(),
                handler);

        obj.getName();

    }

}
