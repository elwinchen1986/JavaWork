package threadtest;

public class ThreadDemo2 {

    private static int _i = 10;

    public static void main(String[] args) {

        ThreadDemo2 demo2 = new ThreadDemo2();
        ThreadDemo2 demo21 = new ThreadDemo2();

        Thread thread = new Thread(() -> {
            demo2.run1();
        }, "线程1");

        Thread thread1 = new Thread(() -> {
            demo21.run2();

        }, "线程2");

        thread.start();
        thread1.start();

    }

    public void run1() {

        for (int i = 0; i < 3; i++) {

            synchronized (this) {
                _i -= 1;

                try {

                    Thread.sleep(100);

                } catch (InterruptedException e) {

                    e.printStackTrace();
                }

                System.out.println(_i + "=====线程名:" + Thread.currentThread().getName());

            }
        }

    }

    public void run2() {

        for (int i = 0; i < 3; i++) {

            synchronized (this) {

                _i -= 1;

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO 自动生成的 catch 块
                    e.printStackTrace();
                }

                System.out.println(_i + "=====线程名:" + Thread.currentThread().getName());
            }
        }

    }

}
