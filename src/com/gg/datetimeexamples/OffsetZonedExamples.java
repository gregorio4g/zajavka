package com.gg.datetimeexamples;

import org.jetbrains.annotations.NotNull;

import java.time.*;

public class OffsetZonedExamples {
    public static void main(String @NotNull [] args) {
        LocalDate localDate = LocalDate.of(2020, 1, 20);
        LocalTime localTime = LocalTime.of(12, 50, 10);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        System.out.println("OffsetDateTime.of(localDateTime, ZoneOffset.UTC) = " + OffsetDateTime.of(localDateTime, ZoneOffset.UTC));
        System.out.println("OffsetDateTime.of(localDateTime, ZoneOffset.of(\"+05:00\")) = " + OffsetDateTime.of(localDateTime, ZoneOffset.of("+05:00")));
        System.out.println("OffsetDateTime.of(localDateTime, ZoneOffset.ofHours(-2)) = " + OffsetDateTime.of(localDateTime, ZoneOffset.ofHours(-2)));

        System.out.println("OffsetDateTime.MAX = " + OffsetDateTime.MAX);
        System.out.println("OffsetDateTime.MIN = " + OffsetDateTime.MIN);
        System.out.println("ZoneOffset.MIN = " + ZoneOffset.MIN);
        System.out.println("ZoneOffset.MAX = " + ZoneOffset.MAX);
        System.out.println("ZoneOffset.UTC = " + ZoneOffset.UTC);

        System.out.println();
        System.out.println("OffsetDateTime.now() = " + OffsetDateTime.now());
        System.out.println("OffsetDateTime.now(ZoneOffset.UTC) = " + OffsetDateTime.now(ZoneOffset.UTC));

        System.out.println();
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, ZoneOffset.ofHours(2));
        System.out.println("offsetDateTime = " + offsetDateTime);
        System.out.println("offsetDateTime.toLocalDate() = " + offsetDateTime.toLocalDate());
        System.out.println("offsetDateTime.toLocalTime() = " + offsetDateTime.toLocalTime());
        System.out.println("offsetDateTime.toLocalDateTime() = " + offsetDateTime.toLocalDateTime());
        System.out.println("offsetDateTime.toZonedDateTime() = " + offsetDateTime.toZonedDateTime());
        System.out.println("offsetDateTime.getOffset() = " + offsetDateTime.getOffset());
        System.out.println("offsetDateTime.getMonth() = " + offsetDateTime.getMonth());
        System.out.println("offsetDateTime.getMonthValue() = " + offsetDateTime.getMonthValue());

        System.out.println();
        System.out.println("ZonedDateTime.now() = " + ZonedDateTime.now());
        System.out.println("ZoneId.getAvailableZoneIds() = " + ZoneId.getAvailableZoneIds());
        System.out.println("ZoneId.of(\"Poland\") = " + ZoneId.of("Poland"));
        System.out.println("ZoneId.systemDefault() = " + ZoneId.systemDefault());
        System.out.println("ZonedDateTime.now(ZoneId.of(\"Poland\")) = " + ZonedDateTime.now(ZoneId.of("Poland")));
        ZoneOffset utc = ZoneOffset.UTC;
        ZoneId usPacific = ZoneId.of("US/Pacific");
        ZoneId paris = ZoneId.of("Europe/Paris");
        System.out.println("ZonedDateTime.of(localDate, localTime, utc) = " + ZonedDateTime.of(localDate, localTime, utc));
        System.out.println("ZonedDateTime.of(localDateTime, utc) = " + ZonedDateTime.of(localDateTime, utc));
        System.out.println("ZonedDateTime.of(localDateTime, usPacific) = " + ZonedDateTime.of(localDateTime, usPacific));
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, paris);
        System.out.println("ZonedDateTime.of(localDateTime, paris) = " + zonedDateTime);
        System.out.println("zonedDateTime.toLocalDate() = " + zonedDateTime.toLocalDate());
        System.out.println("zonedDateTime.toLocalTime() = " + zonedDateTime.toLocalTime());
        System.out.println("zonedDateTime.toLocalDateTime() = " + zonedDateTime.toLocalDateTime());
        System.out.println("zonedDateTime.toOffsetDateTime() = " + zonedDateTime.toOffsetDateTime());
        System.out.println("zonedDateTime.getOffset() = " + zonedDateTime.getOffset());
        System.out.println("zonedDateTime.getZone() = " + zonedDateTime.getZone());
        System.out.println("zonedDateTime.getDayOfMonth() = " + zonedDateTime.getDayOfMonth());
        System.out.println("zonedDateTime.getDayOfWeek() = " + zonedDateTime.getDayOfWeek());
        System.out.println("zonedDateTime.getDayOfYear() = " + zonedDateTime.getDayOfYear());
        System.out.println();
        System.out.println("Daylight:");
        LocalDate date1 = LocalDate.of(2018, 3, 25);
        LocalTime time1 = LocalTime.of(1, 55);
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(date1, time1, paris);
        System.out.println("Step 1: " + zonedDateTime1);
        zonedDateTime1 = zonedDateTime1.plusHours(1);
        System.out.println("Step 2: " + zonedDateTime1);
        zonedDateTime1 = zonedDateTime1.plusHours(1);
        System.out.println("Step 3: " + zonedDateTime1);


        System.out.println("22 minut filmu #43 obejrzałem");

    }
}
