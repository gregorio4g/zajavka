package com.gg.datetimeexamples;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class LocalExamples {
    public static void main(String[] args) {
        System.out.println("LocalDate.now() = " + LocalDate.now());
        System.out.println("LocalTime.now() = " + LocalTime.now());
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now());

        System.out.println("LocalDate.of(2020, 11, 2) = " + LocalDate.of(2020, 11, 2));
        System.out.println("LocalDate.of(2020, Month.NOVEMBER, 2) = " + LocalDate.of(2020, Month.NOVEMBER, 2));
        System.out.println("LocalTime.of(17, 50) = " + LocalTime.of(17, 50));
        System.out.println("LocalTime.of(17, 50, 20) = " + LocalTime.of(17, 50, 20));
        System.out.println("LocalTime.of(17, 50, 20, 902) = " + LocalTime.of(17, 50, 20, 902));
        System.out.println("LocalDateTime.of(2020, 11, 2, 17, 20) = " + LocalDateTime.of(2020, 11, 2, 17, 50));

        System.out.println("LocalDate.ofYearDay(2020, 123) = " + LocalDate.ofYearDay(2020, 123));

        System.out.println("LocalDate.from(LocalDateTime.of(LocalDate.of(2010, 12, 30), LocalTime.of(4, 10))) = " +
                LocalDate.from(LocalDateTime.of(LocalDate.of(2010, 12, 30), LocalTime.of(4, 10))));

        System.out.println("LocalDate.ofEpochDay(20000) = " + LocalDate.ofEpochDay(20000));
        System.out.println("LocalDate.EPOCH = " + LocalDate.EPOCH);
        System.out.println("LocalDate.MIN = " + LocalDate.MIN);
        System.out.println("LocalDate.MAX = " + LocalDate.MAX);

        System.out.println("Arrays.toString(Month.values()) = " + Arrays.toString(Month.values()));

        System.out.println("LocalTime.ofSecondOfDay(86400) = " + LocalTime.ofSecondOfDay(86000));
        System.out.println("LocalTime.ofNanoOfDay(86399999999999L) = " + LocalTime.ofNanoOfDay(86399999999999L));

        System.out.println("LocalTime.MIN = " + LocalTime.MIN);
        System.out.println("LocalTime.MAX = " + LocalTime.MAX);
        System.out.println("LocalTime.NOON = " + LocalTime.NOON);
        System.out.println("LocalTime.MIDNIGHT = " + LocalTime.MIDNIGHT);

        System.out.println("LocalDateTime.from(OffsetDateTime.now()) = " + LocalDateTime.from(OffsetDateTime.now()));

        System.out.println("LocalDateTime.MIN = " + LocalDateTime.MIN);
        System.out.println("LocalDateTime.MAX = " + LocalDateTime.MAX);

        System.out.println();
        LocalDate localDate = LocalDate.of(2020, 1, 20);
        System.out.println("localDate = " + localDate);
        System.out.println("localDate.plusDays(1) = " + localDate.plusDays(1));
        System.out.println("localDate.plusWeeks(2) = " + localDate.plusWeeks(2));
        System.out.println("localDate.plusMonths(3) = " + localDate.plusMonths(3));
        System.out.println("localDate.plusYears(4) = " + localDate.plusYears(4));

        System.out.println("localDate.minusDays(1) = " + localDate.minusDays(1));
        System.out.println("localDate.minusWeeks(2) = " + localDate.minusWeeks(2));
        System.out.println("localDate.minusMonths(3) = " + localDate.minusMonths(3));
        System.out.println("localDate.minusYears(4) = " + localDate.minusYears(4));

        System.out.println("localDate.toEpochDay() = " + localDate.toEpochDay());

        System.out.println();
        LocalTime localTime = LocalTime.of(12, 50, 10);
        System.out.println("localTime = " + localTime);
        System.out.println("localTime.plusNanos(10101) = " + localTime.plusNanos(10101));
        System.out.println("localTime.plusSeconds() = " + localTime.plusSeconds(95));
        System.out.println("localTime.plusMinutes(143) = " + localTime.plusMinutes(143));
        System.out.println("localTime.plusHours(3) = " + localTime.plusHours(3));

        System.out.println("localTime.minusNanos(10101) = " + localTime.minusNanos(10101));
        System.out.println("localTime.minusSeconds() = " + localTime.minusSeconds(95));
        System.out.println("localTime.minusMinutes(143) = " + localTime.minusMinutes(143));
        System.out.println("localTime.minusHours(3) = " + localTime.minusHours(3));

        System.out.println("localTime.toNanoOfDay() = " + localTime.toNanoOfDay());
        System.out.println("localTime.toSecondOfDay() = " + localTime.toSecondOfDay());

        System.out.println();
        LocalDateTime ldt = LocalDateTime.of(localDate, localTime);
        System.out.println("ldt = " + ldt);
        System.out.println("ldt.toLocalDate() = " + ldt.toLocalDate());
        System.out.println("ldt.toLocalTime() = " + ldt.toLocalTime());

        System.out.println("localTime.atDate(localDate) = " + localTime.atDate(localDate));
        System.out.println("localDate.withMonth(8) = " + localDate.withMonth(8));

        System.out.println("localDate.getEra() = " + localDate.getEra());

        LocalDate localDate1 = LocalDate.of(2020, 10, 1);
        LocalDate localDate2 = LocalDate.of(2020, 12,1);
        System.out.println("localDate1.isBefore(localDate2) = " + localDate1.isBefore(localDate2));
        System.out.println("localDate1.isLeapYear() = " + localDate1.isLeapYear());
        System.out.println("localDate1.isAfter(localDate2) = " + localDate1.isAfter(localDate2));

        System.out.println();
        System.out.println("localDate.isSupported(ChronoUnit.DAYS) = " + localDate.isSupported(ChronoUnit.DAYS));
        System.out.println("localDate.plus(2, ChronoUnit.DAYS) = " + localDate.plus(2, ChronoUnit.DAYS));
        System.out.println("localDate.isSupported(ChronoUnit.MONTHS) = " + localDate.isSupported(ChronoUnit.MONTHS));
        System.out.println("localDate.plus(2, ChronoUnit.MONTHS) = " + localDate.plus(2, ChronoUnit.MONTHS));
        System.out.println("localDate.isSupported(ChronoUnit.YEARS) = " + localDate.isSupported(ChronoUnit.YEARS));
        System.out.println("localDate.plus(2, ChronoUnit.YEARS) = " + localDate.plus(2, ChronoUnit.YEARS));
    }
}
