package com.gg.zad08;

public enum Day implements Weekend, WorkingDay {
	MONDAY("MON", true),
	TUESDAY("TUE", true),
	WEDNESDAY("WED", true),
	THURSDAY("THU", true),
	FRIDAY("FRI", true),
	SATURDAY("SAT", false),
	SUNDAY("SUN", false);

	private final String shortName;
	private final boolean workingDay;

	Day(String shortName, boolean workingDay) {
		this.shortName = shortName;
		this.workingDay = workingDay;
	}

	@Override
	public boolean isWeekend() {
		return !this.workingDay;
	}

	@Override
	public String toString() {
		return super.toString() + "(" + shortName + ")";
	}

	@Override
	public boolean isWorkingDay() {
		return this.workingDay;
	}
}
