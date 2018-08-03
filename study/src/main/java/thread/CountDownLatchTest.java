package thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CountDownLatchTest
 *
 * @author chenqiang
 * @date 2018/8/3 15:31
 */
public class CountDownLatchTest {


    public static void main(String[] args) throws InterruptedException {

        final CountDownLatch countDownLatch = new CountDownLatch(2);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(() -> {

            System.out.println("线程1===" + Thread.currentThread().getName());

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            countDownLatch.countDown();

            System.out.println("线程1完成===" + Thread.currentThread().getName());
        });


        executorService.execute(() -> {

            System.out.println("线程2===" + Thread.currentThread().getName());

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            countDownLatch.countDown();

            System.out.println("线程2完成===" + Thread.currentThread().getName());

        });

        countDownLatch.await();

        System.out.println("等待两个线程执行完毕！");

        executorService.shutdown();

    }


}
