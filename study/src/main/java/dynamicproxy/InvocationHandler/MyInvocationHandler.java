package dynamicproxy.InvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object _obj = null;

    public MyInvocationHandler(Object object) {
        this._obj = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("调用前");

        Object object = method.invoke(_obj, args);

        System.out.println("调用后");

        return object;

    }

}
