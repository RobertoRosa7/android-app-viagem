package com.example.appviagem.util;

import androidx.annotation.NonNull;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class UtilDate {

	public static final String DD_MM = "dd/MM";

	@NonNull
	public static Date getDate(@NonNull Calendar calendar) {
		return calendar.getTime();
	}

	@NonNull
	public static Calendar getCalendarInstance() {
		return Calendar.getInstance();
	}

	@NonNull
	public static Date addDays(@NonNull Calendar calendar, int days) {
		calendar.add(Calendar.DATE, days);
		return calendar.getTime();
	}

	public static int getYear() {
		return Calendar.getInstance().get(Calendar.YEAR);
	}

	@NonNull
	public static String formatLocale(@NonNull Date date) {
		SimpleDateFormat dateFormatToLocale = new SimpleDateFormat(DD_MM, Locale.US);
		return dateFormatToLocale.format(date);
	}

}
