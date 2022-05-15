package the.java8;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;

        UnaryOperator<String> hi = Greeting::hi;

        Supplier<Greeting> sprGreeting = Greeting::new;
        Greeting newGreeting = sprGreeting.get();


        String[] names = {"keesun", "zzs", "toby"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));


    }
}
