package thread;

public class MyThread extends Thread {

    private final int id;
    public MyThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for(int i=0; i<50; i++) {
            System.out.printf("My thread_%d : i = %d\n", id, i);
        }
    }
}
