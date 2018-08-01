package threadtest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ThreadDemo3
 *
 * @author chenqiang
 * @date 2018/7/18 20:13
 */
public class ThreadDemo3 {

    public static ReentrantLock lock = new ReentrantLock(true);

    ThreadLocal<String> threadLocal = new ThreadLocal();
    ThreadLocal<String> threadLocal1 = new ThreadLocal();


    public volatile int i = 0;

      int test = 0;


    public void run() {

        int test = 0;
        System.out.println(test);

        int test1= 1;
        System.out.println(test1);


        for (int j = 0; j < 10; j++) {

            try {



                Thread.sleep(100);

                lock.lock();

                i++;
                System.out.println("线程名称=" + Thread.currentThread().getName() + " 值= " + i);


            } catch (InterruptedException e) {
                e.printStackTrace();

            } finally {
                lock.unlock();
            }

        }
    }

    public static void main(String[] args) {

        ThreadDemo3 threadDemo3 = new ThreadDemo3();
        ThreadDemo3 threadDemo4 = new ThreadDemo3();
//        threadDemo3.threadLocal.set(s);
//        threadDemo3.threadLocal1.set(s);
//        s="test";
        System.out.println(threadDemo3.threadLocal.get());
        System.out.println(threadDemo3.threadLocal1.get());

        Thread t1 = new Thread(() -> {
            threadDemo3.run();
        });


        Thread t2 = new Thread(() -> {

            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            threadDemo4.run();


        });


        t1.start();
        t2.start();
    }


}
