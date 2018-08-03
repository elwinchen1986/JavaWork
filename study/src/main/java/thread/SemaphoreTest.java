package thread;

import java.util.concurrent.Semaphore;

/**
 * SemaphoreTest
 *
 * @author chenqiang
 * @date 2018/8/3 16:09
 */
public class SemaphoreTest {

    //　假若一个工厂有5台机器，但是有20个工人，一台机器同时只能被一个工人使用，只有使用完了，其他工人才能继续使用。那么我们就可以通过Semaphore来实现：

    public static void main(String[] args) {

        //工人数
        int workCount = 20;

        //机器数目
        Semaphore semaphore = new Semaphore(5);

        for (int i = 0; i < workCount; i++) {

            new Worker((i + 1) + "", semaphore).start();

        }


    }

    static class Worker extends Thread {

        private String name;
        private Semaphore semaphore;

        public Worker(String name, Semaphore semaphore) {

            this.name = name;
            this.semaphore = semaphore;
        }


        @Override
        public void run() {

            try {
                semaphore.acquire();

                System.out.println("工人" + this.name + "占用一个机器在生产...");

                Thread.sleep(3000);

                System.out.println("工人" + this.name + "释放出机器");

                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
