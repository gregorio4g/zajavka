package com.gg.datetimeexamples;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class PeriodExamples {
    public static void main(String[] args) {
        System.out.println("Period.of(10, 2, 60) = " + Period.of(10, 2, 60));
        System.out.println("Period.ofDays(2) = " + Period.ofDays(2));
        System.out.println("Period.ofMonths(2) = " + Period.ofMonths(2));
        System.out.println("Period.ofWeeks(2) = " + Period.ofWeeks(2));
        System.out.println("Period.ofYears(2) = " + Period.ofYears(2));

        System.out.println("Period.ofYears(10).ofMonths(2).ofDays(60) = " + Period.ofYears(10).ofMonths(2).ofDays(60));

        System.out.println();
        LocalDate localDate1 = LocalDate.of(2020, 10, 1);
        LocalDate localDate2 = LocalDate.of(2025, 12, 15);
        LocalTime localTime = LocalTime.of(20, 10);
        LocalDateTime localDateTime = LocalDateTime.of(localDate1, localTime);
        System.out.println("localDate1.plus(Period.of(2, ,3, 10)) = " + localDate1.plus(Period.of(2, 3, 10)));
//        System.out.println("localTime.plus(Period.of(2, 3, 10)) = " + localTime.plus(Period.of(2, 3, 10)));
        System.out.println("localDateTime.plus(Period.of(2, 3, 10)) = " + localDateTime.plus(Period.of(2, 3, 10)));

        System.out.println("OffsetDateTime.now().plus(Period.of(2, 3, 10)) = " + OffsetDateTime.now().plus(Period.of(2, 3, 10)));
        System.out.println("ZonedDateTime.now().plus(Period.of(2, 3, 10)) = " + ZonedDateTime.now().plus(Period.of(2, 3, 10)));

        System.out.println();
        System.out.println("Period.between(localDate1, localDate2) = " + Period.between(localDate1, localDate2));
        System.out.println("Period.between(localDate1, localDate1) = " + Period.between(localDate1, localDate1));
        System.out.println("Period.between(localDate2, localDate1) = " + Period.between(localDate2, localDate1));

        System.out.println();
        Period period = Period.between(localDate1, localDate2);
        System.out.println("period.get(ChronoUnit.DAYS) = " + period.get(ChronoUnit.DAYS));
        System.out.println("period.get(ChronoUnit.MONTHS) = " + period.get(ChronoUnit.MONTHS));
        System.out.println("period.get(ChronoUnit.YEARS) = " + period.get(ChronoUnit.YEARS));
//        System.out.println("period.get(ChronoUnit.MINUTES) = " + period.get(ChronoUnit.MINUTES));
        System.out.println("period.getDays() = " + period.getDays());
        System.out.println("period.getMonths() = " + period.getMonths());
        System.out.println("period.getYears() = " + period.getYears());

        System.out.println();
        Period period2 = Period.between(localDate2, localDate1);
        System.out.println("period2.isNegative() = " + period2.isNegative());
        System.out.println("period2.isZero() = " + period2.isZero());
        System.out.println("Period.ZERO.isZero() = " + Period.ZERO.isZero());
        System.out.println("period2.toTotalMonths() = " + period2.toTotalMonths());
        System.out.println("period2.getUnits() = " + period2.getUnits());

        System.out.println("period2 = " + period2);
        System.out.println("period2.withDays(-2) = " + period2.withDays(-2));
        System.out.println("period2.withDays(2) = " + period2.withDays(2));
    }
}
