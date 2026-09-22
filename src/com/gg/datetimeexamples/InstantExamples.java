package com.gg.datetimeexamples;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class InstantExamples {
    static void main() {
        System.out.println("Instant.ofEpochSecond(2354234000L) = " + Instant.ofEpochSecond(2354234000L));

        ZoneId zone1 = ZoneId.of("Europe/Warsaw");
        ZoneId zone2 = ZoneId.of("Asia/Singapore");

        LocalDate localDate1 = LocalDate.of(2020, 11, 3);
        LocalTime localTime1 = LocalTime.of(12, 36);

        System.out.println("Instant.now() = " + Instant.now());

        System.out.println();

        System.out.println("ZonedDateTime.of(localDate1, localTime1, zone1) = " + ZonedDateTime.of(localDate1, localTime1, zone1));
        System.out.println("ZonedDateTime.of(localDate1, localTime1, zone1).toInstant() = " + ZonedDateTime.of(localDate1, localTime1, zone1).toInstant());
        System.out.println("ZonedDateTime.of(localDate1, localTime1, zone2) = " + ZonedDateTime.of(localDate1, localTime1, zone2));
        System.out.println("ZonedDateTime.of(localDate1, localTime1, zone2).toInstant() = " + ZonedDateTime.of(localDate1, localTime1, zone2).toInstant());
        System.out.println("ZonedDateTime.of(localDate1, localTime1, ZoneOffset.ofHours(-3)) = " + ZonedDateTime.of(localDate1, localTime1, ZoneOffset.ofHours(-3)));
        System.out.println("ZonedDateTime.of(localDate1, localTime1, ZoneOffset.ofHours(-3)).toInstant() = " + ZonedDateTime.of(localDate1, localTime1, ZoneOffset.ofHours(-3)).toInstant());

        System.out.println();

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate1, localTime1, zone1);
        System.out.println("zonedDateTime.toEpochSecond() = " + zonedDateTime.toEpochSecond());

        System.out.println();
        
        Instant instantOriginal = Instant.ofEpochSecond(zonedDateTime.toEpochSecond());
        Instant instant = instantOriginal.plus(1, ChronoUnit.DAYS);
        System.out.println("instant = " + instant);
        instant = instant.plus(1, ChronoUnit.HOURS);
        System.out.println("instant = " + instant);
//        System.out.println("instant.plus(1, ChronoUnit.WEEKS) = " + instant.plus(1, ChronoUnit.WEEKS));
        System.out.println("instantOriginal.isSupported(ChronoUnit.HOURS) = " + instantOriginal.isSupported(ChronoUnit.HOURS));
        System.out.println("instantOriginal.isSupported(ChronoUnit.YEARS) = " + instantOriginal.isSupported(ChronoUnit.YEARS));

        System.out.println();

        Instant instantPeriod = instantOriginal.plus(Period.of(0, 0, 2));
        Instant instantDuration = instantOriginal.plus(Duration.ofHours(78));

        System.out.println("instantPeriod.isAfter(instantOriginal) = " + instantPeriod.isAfter(instantOriginal));
        System.out.println("instantDuration.isBefore(instantOriginal) = " + instantDuration.isBefore(instantOriginal));
        System.out.println("instantOriginal.truncatedTo(ChronoUnit.DAYS) = " + instantOriginal.truncatedTo(ChronoUnit.DAYS));
    }
}
