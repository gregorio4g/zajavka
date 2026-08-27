package com.gg.datetimeexamples;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class InstantExamples {
    static void main() {
        System.out.println("Instant.ofEpochSecond(2354234000L) = " + Instant.ofEpochSecond(2354234000L));

        ZoneId zone1 = ZoneId.of("Europe/Warsaw");
        ZoneId zone2 = ZoneId.of("Asia/Singapore");

        LocalDate localDate1 = LocalDate.of(2020, 11, 3);
        LocalTime localTime1 = LocalTime.of(12, 36);

        System.out.println("Instant.now() = " + Instant.now());
    }
}
