package com.gg.zad8;

import java.util.Arrays;

public enum DanceClass {
  TANIEC_OPETANIEC(new String[]{"00:30, 02:00"}, new Day[]{Day.MONDAY, Day.TUESDAY}, DanceClass.valueOf("BELGIJKA")),
  OBEREK(new String[]{"15:30, 17:00"}, new Day[]{Day.WEDNESDAY, Day.SATURDAY}, DanceClass.valueOf("BELGIJKA")),
  KUJAWIAK(new String[]{"10:15, 11:45"}, new Day[]{Day.THURSDAY, Day.SUNDAY}, DanceClass.valueOf("BELGIJKA")),
  BOOGIE_WOOGIE_DLA_PAPUGI(new String[]{"09:00, 10:30"}, new Day[]{Day.TUESDAY, Day.FRIDAY}, DanceClass.valueOf("BELGIJKA")),
  HIPHOP(new String[]{"00:12, 01:45"}, new Day[]{Day.SATURDAY, Day.SUNDAY}, DanceClass.valueOf("BELGIJKA")),
  MODERN_JAZZ(new String[]{"15:30, 17:00"}, new Day[]{Day.MONDAY, Day.TUESDAY}, DanceClass.valueOf("BELGIJKA")),
  MENUET(new String[]{"15:30, 17:00"}, new Day[]{Day.MONDAY, Day.TUESDAY}, DanceClass.valueOf("BELGIJKA")),
  BELGIJKA(new String[]{"15:30, 17:00"}, new Day[]{Day.MONDAY, Day.TUESDAY}, DanceClass.valueOf("BREAKDANCE")),
  BREAKDANCE(new String[]{"15:30, 17:00"}, new Day[]{Day.MONDAY, Day.TUESDAY}, DanceClass.valueOf("BELGIJKA")),
  TANIEC_BRZUCHA(new String[]{"15:30, 17:00"}, new Day[]{Day.MONDAY, Day.TUESDAY}, DanceClass.valueOf("BELGIJKA")),;

  DanceClass(String[] hours, Day[] days, DanceClass alternative) {
    this.hours = hours;
    this.days = days;
    this.alternative = alternative;
  }

  private final String[] hours;
  private final Day[] days;
  private final DanceClass alternative;

  @Override
  public String toString() {
    return super.toString() + ": possible hours: " + Arrays.toString(hours) + ", days: " + Arrays.toString(days) +
        ", alternative: " + alternative;
  }
}

