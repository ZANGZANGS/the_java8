package the.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class App {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("keesun");
        name.add("toby");
        name.add("zzs");
        name.add("foo");

//        name.forEach(System.out::println);

        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        while (spliterator.tryAdvance(System.out::println));
        System.out.println("==============");
        while (spliterator1.tryAdvance(System.out::println));
        
        System.out.println("==============");
        Comparator.reverseOrder();
        Comparator.naturalOrder();


    }
}

