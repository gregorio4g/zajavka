package com.gg.datetimeexamples;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationExamples {
    static void main() {
        System.out.println("Duration.ofDays(1) = " + Duration.ofDays(1));
        System.out.println("Duration.ofHours(1) = " + Duration.ofHours(1));
        System.out.println("Duration.ofMinutes() = " + Duration.ofMinutes(1));
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
    }
}
