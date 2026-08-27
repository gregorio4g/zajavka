package com.gg.datetimeexamples;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationExamples {
    static void main() {
        System.out.println("Duration.ofDays(1) = " + Duration.ofDays(1));
        System.out.println("Duration.ofHours(1) = " + Duration.ofHours(1));
        System.out.println("Duration.ofMinutes(1) = " + Duration.ofMinutes(1));
        System.out.println("Duration.ofSeconds(1) = " + Duration.ofSeconds(1));
        System.out.println("Duration.ofMillis(1) = " + Duration.ofMillis(1));
        System.out.println("Duration.ofNanos(1) = " + Duration.ofNanos(1));

        System.out.println("Duration.ofNanos(1).ofHours(2).ofMinutes(3) = " + Duration.ofNanos(1).ofHours(2).ofMinutes(3));

        System.out.println("Duration.of(1, ChronoUnit.DAYS) = " + Duration.of(100, ChronoUnit.DAYS));
        System.out.println("Duration.of(1, ChronoUnit.HOURS) = " + Duration.of(1, ChronoUnit.HOURS));
        System.out.println("Duration.of(1, ChronoUnit.MINUTES) = " + Duration.of(1, ChronoUnit.MINUTES));
        System.out.println("Duration.of(1, ChronoUnit.SECONDS) = " + Duration.of(1, ChronoUnit.SECONDS));
        System.out.println("Duration.of(1, ChronoUnit.MILLIS) = " + Duration.of(1, ChronoUnit.MILLIS));
        System.out.println("Duration.of(1, ChronoUnit.NANOS) = " + Duration.of(1, ChronoUnit.NANOS));

        System.out.println();
        
        LocalDate localDate = LocalDate.of(2012, 1, 23);
        LocalTime localTime = LocalTime.of(12, 1, 23);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        
        Period period = Period.ofDays(1);
        Duration duration = Duration.ofHours(1);

        System.out.println("localDate.plus(period)) = " + localDate.plus(period));
//        System.out.println("localDate.plus(duration) = " + localDate.plus(duration));
//        System.out.println("localTime.plus(period) = " + localTime.plus(period));
        System.out.println("localTime.plus(duration) = " + localTime.plus(duration));
        System.out.println("localDateTime.plus(period) = " + localDateTime.plus(period));
        System.out.println("localDateTime.plus(duration) = " + localDateTime.plus(duration));

        System.out.println();

        LocalDate localDate1 = LocalDate.of(2020, 10, 20);
        LocalDate localDate2 = LocalDate.of(2020, 11, 20);
        LocalTime localTime1 = LocalTime.of(20, 10, 20);
        LocalTime localTime2 = LocalTime.of(23, 10, 27);
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate1,localTime1);
        LocalDateTime localDateTime2 = LocalDateTime.of(localDate2,localTime2);

//        System.out.println("Duration.between(localDate1, localDate2) = " + Duration.between(localDate1, localDate2));
//        System.out.println("Duration.between(localTime1,localDate2) = " + Duration.between(localTime1, localDate2));
        System.out.println("Duration.between(localTime1,localTime2) = " + Duration.between(localTime1, localTime2));
        System.out.println("Duration.between(localDateTime1,localDateTime2) = " + Duration.between(localDateTime1, localDateTime2));

        System.out.println();

        System.out.println("ChronoUnit.DAYS.between(localDate1, localDate2) = " + ChronoUnit.DAYS.between(localDate1, localDate2));
//        System.out.println("ChronoUnit.DAYS.between(localTime1,localTime2) = " + ChronoUnit.DAYS.between(localTime1, localTime2));
//        System.out.println("ChronoUnit.HOURS.between(localDate1,localDate2) = " + ChronoUnit.HOURS.between(localDate1, localDate2));
        System.out.println("ChronoUnit.HOURS.between(localTime1, localTime2) = " + ChronoUnit.HOURS.between(localTime1, localTime2));
        System.out.println("ChronoUnit.DAYS.between(localDateTime1, localDateTime2) = " + ChronoUnit.DAYS.between(localDateTime1, localDateTime2));
        System.out.println("ChronoUnit.HOURS.between(localDateTime1, localDateTime2) = " + ChronoUnit.HOURS.between(localDateTime1, localDateTime2));

        System.out.println();

        Duration duration12 = Duration.between(localTime1, localTime2);

        System.out.println("duration12 = " + duration12);
        System.out.println("duration12.getUnits() = " + duration12.getUnits());
        System.out.println("duration12.getSeconds() = " + duration12.getSeconds());
        System.out.println("duration12.getNano() = " + duration12.getNano());
        System.out.println("duration12.get(ChronoUnit.SECONDS) = " + duration12.get(ChronoUnit.SECONDS));
        System.out.println("duration12.get(ChronoUnit.NANOS) = " + duration12.get(ChronoUnit.NANOS));

        System.out.println();

        System.out.println("duration12.isNegative() = " + duration12.isNegative());
        System.out.println("duration12.isPositive() = " + duration12.isPositive());
        System.out.println("duration12.isZero() = " + duration12.isZero());
        System.out.println("Duration.ZERO.isZero() = " + Duration.ZERO.isZero());

        System.out.println("duration12.toMinutes() = " + duration12.toMinutes());
        System.out.println("duration12.toHours() = " + duration12.toHours());
        System.out.println("duration12.toHoursPart() = " + duration12.toHoursPart());

        System.out.println();

        System.out.println("duration12.truncatedTo(ChronoUnit.SECONDS) = " + duration12.truncatedTo(ChronoUnit.SECONDS));
        System.out.println("duration12.truncatedTo(ChronoUnit.MINUTES) = " + duration12.truncatedTo(ChronoUnit.MINUTES));
        System.out.println("duration12.truncatedTo(ChronoUnit.HOURS) = " + duration12.truncatedTo(ChronoUnit.HOURS));
        System.out.println("duration12.truncatedTo(ChronoUnit.DAYS) = " + duration12.truncatedTo(ChronoUnit.DAYS));

    }
}
