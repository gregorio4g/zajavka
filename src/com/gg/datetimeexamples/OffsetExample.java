package com.gg.datetimeexamples;

import org.jetbrains.annotations.NotNull;

import java.time.*;

public class OffsetExample {
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
        System.out.println("13 minut filmu #43 obejrzałem");

    }
}
