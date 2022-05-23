package the.java8.completableFuture;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.*;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(()-> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "hello";
        }).thenApply((s) -> {
            System.out.println(Thread.currentThread().getName());
            return s.toUpperCase();
        });

        future.get();


    }

}
