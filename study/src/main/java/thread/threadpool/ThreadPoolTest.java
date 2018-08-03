package thread.threadpool;

import java.util.concurrent.*;

/**
 * 线程池
 *
 * @author chenqiang
 * @date 2018/7/26 14:40
 */
public class ThreadPoolTest {

    private static volatile int sum = 0;

    public static void main(String[] args) {

        // 无限制，最大int.max个线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        executor(executorService);

        // 固定个数
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
        executor(fixedThreadPool);


        // 单个线程
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        executor(singleThreadExecutor);

        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        submit(scheduledThreadPool);
    }

    public static void executor(ExecutorService service) {

        for (int i = 0; i < 10; i++) {
            service.execute(() -> {

                synchronized (ThreadPoolTest.class) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    sum += 1;

                }

                System.out.println("thread-name=" + Thread.currentThread().getName() + "   value==" + sum);
            });
        }


    }

    public static void submit(ExecutorService service) {

        CompletionService<String> completionService = new ExecutorCompletionService<String>(service);

        for (int i = 0; i < 10; i++) {

            Future<String> stringFuture = completionService.submit(new Callable<String>() {

                @Override
                public synchronized String call() throws Exception {

                    sum += 1;
                    return sum + "";
                }
            });


            try {
                System.out.println("thread-name=" + Thread.currentThread().getName() + "   value=" + stringFuture.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        service.shutdown();


    }


}
