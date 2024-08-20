package com.gg.datetimeexamples;

import java.time.*;

public class OffsetExample {
    public static void main(String[] args) {
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

        System.out.println("9 minut filmu #43 obejrzałem");

    }
}
