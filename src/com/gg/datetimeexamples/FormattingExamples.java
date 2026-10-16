package com.gg.datetimeexamples;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormattingExamples {
    static void main() {
        LocalDate date = LocalDate.of(2018, Month.OCTOBER, 28);
        LocalTime time = LocalTime.of(1, 50);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime, ZoneOffset.ofHours(-4));
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, ZoneId.of("Europe/Paris"));
        Instant instant = zonedDateTime.toInstant();

        System.out.println("date = " + date);
        System.out.println("time = " + time);
        System.out.println("dateTime = " + dateTime);
        System.out.println("offsetDateTime = " + offsetDateTime);
        System.out.println("zonedDateTime = " + zonedDateTime);
        System.out.println("instant = " + instant);
        System.out.println();

        System.out.println("DateTimeFormatter.ISO_LOCAL_DATE.format(date) = " + DateTimeFormatter.ISO_LOCAL_DATE.format(date));
//        System.out.println("DateTimeFormatter.ISO_LOCAL_DATE.format(time) = " + DateTimeFormatter.ISO_LOCAL_DATE.format(time));
        System.out.println("DateTimeFormatter.ISO_LOCAL_DATE.format(dateTime) = " + DateTimeFormatter.ISO_LOCAL_DATE.format(dateTime));
        System.out.println("DateTimeFormatter.ISO_LOCAL_DATE.format(offsetDateTime) = " + DateTimeFormatter.ISO_LOCAL_DATE.format(offsetDateTime));
        System.out.println("DateTimeFormatter.ISO_LOCAL_DATE.format(zonedDateTime) = " + DateTimeFormatter.ISO_LOCAL_DATE.format(zonedDateTime));
//        System.out.println("DateTimeFormatter.ISO_LOCAL_DATE.format(instant) = " + DateTimeFormatter.ISO_LOCAL_DATE.format(instant));
        System.out.println();

//        System.out.println("DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(date) = " + DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(date));
//        System.out.println("DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(time) = " + DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(time));
        System.out.println("DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(dateTime) = " + DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(dateTime));
        System.out.println("DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(offsetDateTime) = " + DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(offsetDateTime));
        System.out.println("DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTime) = " + DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTime));
//        System.out.println("DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(instant) = " + DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(instant));
        System.out.println();

//        System.out.println("DateTimeFormatter.RFC_1123_DATE_TIME.format(date) = " + DateTimeFormatter.RFC_1123_DATE_TIME.format(date));
//        System.out.println("DateTimeFormatter.RFC_1123_DATE_TIME.format(time) = " + DateTimeFormatter.RFC_1123_DATE_TIME.format(time));
//        System.out.println("DateTimeFormatter.RFC_1123_DATE_TIME.format(dateTime) = " + DateTimeFormatter.RFC_1123_DATE_TIME.format(dateTime));
        System.out.println("DateTimeFormatter.RFC_1123_DATE_TIME.format(offsetDateTime) = " + DateTimeFormatter.RFC_1123_DATE_TIME.format(offsetDateTime));
        System.out.println("DateTimeFormatter.RFC_1123_DATE_TIME.format(zonedDateTime) = " + DateTimeFormatter.RFC_1123_DATE_TIME.format(zonedDateTime));
//        System.out.println("DateTimeFormatter.RFC_1123_DATE_TIME.format(instant) = " + DateTimeFormatter.RFC_1123_DATE_TIME.format(instant));
        System.out.println();

        System.out.println("DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(zonedDateTime) = " + DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(zonedDateTime));
        System.out.println("DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(zonedDateTime) = " + DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(zonedDateTime));
        System.out.println("DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(zonedDateTime) = " + DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(zonedDateTime));
        System.out.println("DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(zonedDateTime) = " + DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(zonedDateTime));
        System.out.println();

        System.out.println("DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(zonedDateTime) = " + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(zonedDateTime));
        System.out.println("DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).format(zonedDateTime) = " + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).format(zonedDateTime));
        System.out.println("DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(zonedDateTime) = " + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(zonedDateTime));
        System.out.println("DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(zonedDateTime) = " + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(zonedDateTime));
        System.out.println();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss VV");
        System.out.println("formatter.format(zonedDateTime) = " + formatter.format(zonedDateTime));
        System.out.println();

        String stringDate = "Mon, 05 May 1980";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEE, d MMM yyyy", Locale.ENGLISH);
        System.out.println("LocalDate.parse(stringDate, formatter2) = " + LocalDate.parse(stringDate, formatter2));
        System.out.println();

        String stringPeriod = "P12Y10M3D";
        System.out.println("Period.parse(stringPeriod) = " + Period.parse(stringPeriod));
        System.out.println("Period.parse(\"-P12Y10M3D\") = " + Period.parse("-P12Y10M3D"));
        System.out.println();

        String stringDuration = "PT29H34M10S";
        System.out.println("Duration.parse(stringDuration) = " + Duration.parse(stringDuration));
        System.out.println("Duration.parse(\"-PT29H34M10S\") = " + Duration.parse("-PT29H34M10S"));
        System.out.println();


    }
}
