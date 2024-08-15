package com.gg.zadania.zad08;

import java.util.Arrays;

public enum DanceClass {
	TANIEC_OPETANIEC(new String[]{"00:30, 02:00"}, new Day[]{Day.MONDAY, Day.TUESDAY}) {
		@Override
		public String getAlternative() {
			return BELGIJKA.toStringSimple();
		}
	},
	OBEREK(new String[]{"15:30, 17:00"}, new Day[]{Day.WEDNESDAY, Day.SATURDAY}) {
		@Override
		public String getAlternative() {
			return BELGIJKA.toStringSimple();
		}
	},
	KUJAWIAK(new String[]{"10:15, 11:45"}, new Day[]{Day.THURSDAY, Day.SUNDAY}) {
		@Override
		public String getAlternative() {
			return BELGIJKA.toStringSimple();
		}
	},
	BOOGIE_WOOGIE_DLA_PAPUGI(new String[]{"09:00, 10:30"}, new Day[]{Day.TUESDAY, Day.FRIDAY}) {
		@Override
		public String getAlternative() {
			return BELGIJKA.toStringSimple();
		}
	},
	HIPHOP(new String[]{"00:12, 01:45"}, new Day[]{Day.SATURDAY, Day.SUNDAY}) {
		@Override
		public String getAlternative() {
			return BELGIJKA.toStringSimple();
		}
	},
	MODERN_JAZZ(new String[]{"15:30, 17:00"}, new Day[]{Day.MONDAY, Day.TUESDAY}) {
		@Override
		public String getAlternative() {
			return BELGIJKA.toStringSimple();
		}
	},
	MENUET(new String[]{"15:30, 17:00"}, new Day[]{Day.MONDAY, Day.TUESDAY}) {
		@Override
		public String getAlternative() {
			return BELGIJKA.toStringSimple();
		}
	},
	BELGIJKA(new String[]{"15:30, 17:00"}, new Day[]{Day.MONDAY, Day.TUESDAY}) {
		@Override
		public String getAlternative() {
			return BREAKDANCE.toStringSimple();
		}
	},
	BREAKDANCE(new String[]{"15:30, 17:00"}, new Day[]{Day.MONDAY, Day.TUESDAY}) {
		@Override
		public String getAlternative() {
			return BELGIJKA.toStringSimple();
		}
	},
	TANIEC_BRZUCHA(new String[]{"15:30, 17:00"}, new Day[]{Day.MONDAY, Day.TUESDAY}) {
		@Override
		public String getAlternative() {
			return BELGIJKA.toStringSimple();
		}
	},
	;

	private final String[] hours;
	private final Day[] days;
		DanceClass(String[] hours, Day[] days) {
		this.hours = hours;
		this.days = days;
	}

	@Override
	public String toString() {
		return super.toString() + ": possible hours: " + Arrays.toString(hours) + ", days: " + Arrays.toString(days) +
				", alternative: " + getAlternative();
	}

	public String toStringSimple() {
			return super.toString();
	}

	public abstract String getAlternative();
}

