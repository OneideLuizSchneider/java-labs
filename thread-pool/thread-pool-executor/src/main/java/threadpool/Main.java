package threadpool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 *
 * @author oneide.schneider
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            System.out.println("Run in 1 " + new Date());
            Thread.sleep(2000);
            System.out.println("That's it 1 " + new Date());
            return null;
        });
        executor.submit(() -> {
            System.out.println("Run in 2 " + new Date());
            Thread.sleep(4000);
            System.out.println("That's it 2 " + new Date());
            return null;
        });
        executor.submit(() -> {
            System.out.println("Run in 3 " + new Date());
            Thread.sleep(1000);
            System.out.println("That's it 3 " + new Date());
            return null;
        });

        System.out.println("Pool size " + executor.getPoolSize());
        System.out.println("Queue size " + executor.getQueue().size());
        System.out.println("Active count " + executor.getActiveCount());

        executor.shutdown();

        while (!executor.isTerminated()) {
            Thread.sleep(500);
            System.out.println("Active count " + executor.getActiveCount());            
        }
        
        System.out.println("Finished all threads  " + new Date());

    }

}
