package thread;

public class Program {


    public static void main(String[] args) {
        MyThread thread1 = new MyThread(1);
        // thread1.run(); ===> 이렇게하면 절대 안됨!!!
        thread1.start();

        MyThread thread2 = new MyThread(2);
        thread2.start();

        MyThread thread3 = new MyThread(3);
        thread3.start();

        // Runnable Thread
        MyRunnable runnable1 = new MyRunnable(1);
        Thread tr1 = new Thread(runnable1);
        tr1.start();




        MyLoop loop = new MyLoop(); // thread 아님
        loop.run();

        for(int i=0; i<50; i++) {
            System.out.printf("main thread : i = %d\n", i);
        }
    }
}
