package the.java8.datetime;

import java.util.*;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(date);
        System.out.println(time);

        Thread.sleep(1000 * 3);
        Date after3seconds = new Date();
        System.out.println(after3seconds);
        after3seconds.setTime(time);
        System.out.println(after3seconds);
    }
}

