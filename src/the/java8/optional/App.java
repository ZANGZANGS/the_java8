package the.java8.optional;

import the.java8.stream.OnlineClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        Optional<OnlineClass> optional = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

//        OnlineClass onlineClass = optional.get();
//        System.out.println(onlineClass.getTitle()); //noSuchElementException

        OnlineClass onlineClass = optional.orElseGet(() -> createNewClass());
        System.out.println(onlineClass.getTitle());

    }

    private static OnlineClass createNewClass() {
        System.out.println("creating new Online class");
        return new OnlineClass(10, "New class", false);
    }
}

