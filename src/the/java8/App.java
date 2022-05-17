package the.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("keesun");
        names.add("toby");
        names.add("zzs");
        names.add("foo");

        List<String> stringStream = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());


        List<String> stringParallelStream = names.parallelStream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());


        names.forEach(System.out::println);


    }
}

