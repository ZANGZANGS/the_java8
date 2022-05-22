package the.java8.completableFuture;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService.scheduleAtFixedRate(getRunnable("Hello"), 3, 2, TimeUnit.SECONDS);


    }

    private static Runnable getRunnable(String message) {
        return () -> System.out.println(message +", "+ Thread.currentThread().getName());
    }
}
