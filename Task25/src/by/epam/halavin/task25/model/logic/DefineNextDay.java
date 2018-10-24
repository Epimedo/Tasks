package by.epam.halavin.task25.model.logic;

import by.epam.halavin.task25.model.entity.Date;

public class DefineNextDay {
	static final int COFFORLEAPONE = 4;
	static final int COFFORLEAPTWO = 100;
	static final int COFFORLEAPTHREE = 400;
	static final int YEARDAYSNUMBER = 365;
	static final int YEARDAYSLEAPNUMBER = 366;
	static final int[] DAYSNUMBER = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static final int[] LEAPDAYSNUMBER = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(Date date) {
		boolean result = false;

		if (date.getYear() % COFFORLEAPONE == 0 && date.getYear() % COFFORLEAPTWO == 0
				&& date.getYear() % COFFORLEAPTHREE == 0) {
			result = true;
		} else if (date.getYear() % COFFORLEAPONE == 0 && !(date.getYear() % COFFORLEAPTWO == 0)) {
			result = true;
		}

		return result;
	}

	public Date defineNextDay(Date date) {
		Date nextdaydate = new Date();

		nextdaydate.setDay(date.getDay());
		nextdaydate.setMonth(date.getMonth());
		nextdaydate.setYear(date.getYear());

		if (isLeapYear(nextdaydate)) {
			if (nextdaydate.getDay() + 1 > LEAPDAYSNUMBER[nextdaydate.getMonth() - 1]) {
				nextdaydate.setDay(1);
				nextdaydate.setMonth(nextdaydate.getMonth() + 1);
				if (nextdaydate.getMonth() > 12) {
					nextdaydate.setMonth(1);
					nextdaydate.setYear(nextdaydate.getYear() + 1);
				}
			} else {
				nextdaydate.setDay(nextdaydate.getDay() + 1);
			}

		} else {
			if (nextdaydate.getDay() + 1 > DAYSNUMBER[nextdaydate.getMonth() - 1]) {
				nextdaydate.setDay(1);
				nextdaydate.setMonth(nextdaydate.getMonth() + 1);
				if (nextdaydate.getMonth() > 12) {
					nextdaydate.setMonth(1);
					nextdaydate.setYear(nextdaydate.getYear() + 1);
				}
			} else {
				nextdaydate.setDay(nextdaydate.getDay() + 1);
			}

		}

		return nextdaydate;
	}
}
