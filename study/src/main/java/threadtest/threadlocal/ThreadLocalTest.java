package threadtest.threadlocal;

/**
 * ThreadLocalTest
 *
 * @author chenqiang
 * @date 2018/8/1 17:24
 */
public class ThreadLocalTest {

    private static ThreadLocal<Long> myThreadLocal = new ThreadLocal<>();
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args)  {

        Thread thread1 = new Thread(() -> {

            setValue();
            get();
        });

        thread1.setName("线程1");

        Thread thread2 = new Thread(() -> {

            setValue();
            get();
        });

        thread2.setName("线程2");


        thread1.start();
        thread2.start();


    }

    private static void get() {
        System.out.println(myThreadLocal.get());
        System.out.println(threadLocal.get());
    }

    private static void setValue() {
        myThreadLocal.set(Thread.currentThread().getId());
        threadLocal.set(Thread.currentThread().getName());


    }
}
