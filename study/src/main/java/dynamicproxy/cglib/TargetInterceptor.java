package dynamicproxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class TargetInterceptor implements MethodInterceptor {

//    private Object obj = null;
//    private Method method;

    /**
     * @param obj
     * @param method
     * @param args
     * @param proxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
//        this.obj = obj;
//        this.method = method;
//        this.args = args;
//        this.proxy = proxy;

        System.out.println("调用前" + method.getName());

        Object result = proxy.invokeSuper(obj, args);

        System.out.println(" 调用后" + result);

        return result;

    }

}
