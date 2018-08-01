package threadtest.join;

import java.util.concurrent.TimeUnit;

/**
 * JoinTest
 * Create by  chenqiang  on   2017/12/26 12:08
 */
public class JoinTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new DSLoader());
        Thread t2 = new Thread(new NetLoader());

        t1.start();
        t2.start();

        try {
            // t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ending all");
    }
}


class DSLoader implements Runnable {
    @Override
    public void run() {
        System.out.println("begining the DSLoader");
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("DSLoader has finished");
    }
}


class NetLoader implements Runnable {
    @Override
    public void run() {
        System.out.println("begining the NetLoader");
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("NetLoader has finished");
    }
}