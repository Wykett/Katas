package com.wykett.katas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UnluckyDayKata {
	public static int unluckyDays(int year) {
		Date firstThirteen = null;
		try {
			firstThirteen = new SimpleDateFormat("dd/MM/yyyy").parse("13/01/" + year);
		} catch (Exception e) {
			return 0;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(firstThirteen);
		int fridayThirteenCountInYear = 0;
		for (int i = 0; i < 12; i++) {
			if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
				fridayThirteenCountInYear++;
			}
			cal.add(Calendar.MONTH, 1);
		}
		return fridayThirteenCountInYear;
	}
}
