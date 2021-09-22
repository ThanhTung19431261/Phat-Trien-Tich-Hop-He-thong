import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Vdtuan3 implements Runnable {
    String message;

    Vdtuan3(String s) {
        message = s;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start msg: " + message);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " END");
    }

    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            Runnable w = new Vdtuan3(" " + i);
            ex.execute(w);
        }
        ex.shutdown();

        while (!ex.isTerminated()) {

            System.out.println("Finish All Threads");
        }
    }
}
