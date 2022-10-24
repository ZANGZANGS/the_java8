package the.java8.annotation;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;


@Chicken("양념")
@Chicken("마늘간장")
@Chicken("후라이드")
public class App {
    public static void main(String[] args){

        Chicken[] chickens = App.class.getAnnotationsByType(Chicken.class);
        Arrays.stream(chickens).forEach(chicken -> {
            System.out.println(chicken.value());
        });

    }

}

