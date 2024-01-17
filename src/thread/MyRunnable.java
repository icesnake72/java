package thread;

public class MyRunnable implements Runnable {

    private int id;
    public MyRunnable(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            for(int i=0; i<50; i++) {
                System.out.printf("My Runnable_%d : i = %d\n", id, i);
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
