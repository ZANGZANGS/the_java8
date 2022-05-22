package the.java8.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant); //기준시 UTC, GMT
        System.out.println(instant.atZone(ZoneId.systemDefault()));
        System.out.println(instant.atZone(ZoneId.of("UTC")));

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime birthDay =
                LocalDateTime.of(1994, Month.JULY, 7, 0, 0, 0);
        ZonedDateTime nowInKorea = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println(nowInKorea);

        Instant nowInstant = instant.now();
        ZonedDateTime zonedDateTime = nowInstant.atZone(ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTime);


        System.out.println("=================== period");

        LocalDate today = LocalDate.now();
        LocalDate thisYearBirthday = LocalDate.of(2022, Month.JULY, 7);

        Period period = Period.between(today, thisYearBirthday);
        System.out.println(period.getDays());

        Period until = today.until(thisYearBirthday);
        System.out.println(until.get(ChronoUnit.DAYS));
        System.out.println(until.getDays());


        System.out.println("=================== duration");

        Instant now2 = Instant.now();
        Instant plus = now2.plus(10, ChronoUnit.SECONDS);
        Duration between = Duration.between(now2, plus);
        System.out.println(between.getSeconds());

        System.out.println("=================== format");
        Date date = new Date();
        Instant instant1 = date.toInstant();
        Date newDate = Date.from(instant1);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        ZonedDateTime dateTime = gregorianCalendar.toInstant().atZone(ZoneId.systemDefault());
        GregorianCalendar from = GregorianCalendar.from(dateTime);

        ZoneId zoneId = TimeZone.getTimeZone("PST").toZoneId(); //과거 api에서 ZoneId로 변환을 지원
        TimeZone timeZone = TimeZone.getTimeZone(zoneId);

        LocalDateTime now3 = LocalDateTime.now();
        DateTimeFormatter MMddyyyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now3.format(MMddyyyy));

        LocalDate parse = LocalDate.parse("07/15/1994", MMddyyyy);
        System.out.println(parse);


    }
}

