package com.gg.datetimeexamples;

import java.time.*;

public class PeriodExamples {
    public static void main(String[] args) {
        System.out.println("Period.of(10, 2, 60) = " + Period.of(10, 2, 60));
        System.out.println("Period.ofDays(2) = " + Period.ofDays(2));
        System.out.println("Period.ofMonths(2) = " + Period.ofMonths(2));
        System.out.println("Period.ofWeeks(2) = " + Period.ofWeeks(2));
        System.out.println("Period.ofYears(2) = " + Period.ofYears(2));

        System.out.println("Period.ofYears(10).ofMonths(2).ofDays(60) = " + Period.ofYears(10).ofMonths(2).ofDays(60));

        System.out.println();
        LocalDate localDate = LocalDate.of(2020, 10, 1);
        LocalTime localTime = LocalTime.of(20, 10);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDate.plus(Period.of(2, ,3, 10)) = " + localDate.plus(Period.of(2, 3, 10)));
//        System.out.println("localTime.plus(Period.of(2, 3, 10)) = " + localTime.plus(Period.of(2, 3, 10)));
        System.out.println("localDateTime.plus(Period.of(2, 3, 10)) = " + localDateTime.plus(Period.of(2, 3, 10)));

        System.out.println("OffsetDateTime.now().plus(Period.of(2, 3, 10)) = " + OffsetDateTime.now().plus(Period.of(2, 3, 10)));
        System.out.println("ZonedDateTime.now().plus(Period.of(2, 3, 10)) = " + ZonedDateTime.now().plus(Period.of(2, 3, 10)));

    }
}
