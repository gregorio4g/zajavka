package com.gg.zad8;

public class Main {
	public static void main(String[] args) {
		Day mon = Day.valueOf("MONDAY");
		System.out.println(mon);

		for (Day day : Day.values()) {
			System.out.println(day + " is working day?: " + day.isWorkingDay() + " Is weekend?: " + day.isWeekend());
		}

		for (DanceClass danceClass : DanceClass.values()) {
			System.out.println(danceClass);
		}
	}
}
