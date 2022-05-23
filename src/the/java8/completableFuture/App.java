package the.java8.completableFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<String> hello = () -> {
            Thread.sleep(2000L);
            return "hello";
        };

        Callable<String> java = () -> {
            Thread.sleep(3000L);
            return "java";
        };

        Callable<String> zzs = () -> {
            Thread.sleep(1000L);
            return "zzs";
        };

        String s = executorService.invokeAny(Arrays.asList(hello, java, zzs));

        System.out.println(s);


        executorService.shutdown();

    }

}
