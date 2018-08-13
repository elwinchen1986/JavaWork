package thread;

public class ThreadDemo1 {

    private int _tt = 10;

    public static void main(String[] args) {

        ThreadDemo1 demo1 = new ThreadDemo1();
        ThreadDemo1 demo2 = new ThreadDemo1();

        Thread thread = new Thread(() -> {
            demo1.run();
            demo1.run1();
        }, "线程0");

        Thread thread1 = new Thread(() -> {
            demo1.run();
            demo1.run1();
        }, "线程1");


        thread.start();
        thread1.start();

    }

    public void run() {

        synchronized (ThreadDemo1.class) {
            _tt -= 1;
            System.out.println("t=====" + _tt + "线程名称" + Thread.currentThread().getName());

        }
    }

    public void run1() {

        synchronized (ThreadDemo1.class) {
            _tt -= 1;
            System.out.println("t=====" + _tt + "线程名称" + Thread.currentThread().getName());

        }
    }

}
