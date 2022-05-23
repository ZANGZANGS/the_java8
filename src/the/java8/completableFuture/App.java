package the.java8.completableFuture;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        });

        CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> {
            System.out.println("World " + Thread.currentThread().getName());
            return "World";
        });

        List<CompletableFuture> futures = Arrays.asList(hello, world);
        CompletableFuture[] futuresArray = futures.toArray(new CompletableFuture[futures.size()]);

        CompletableFuture<Void> future = CompletableFuture.allOf(futuresArray).thenAccept((s) -> System.out.println(s));

        System.out.println(future.get());


    }

}
