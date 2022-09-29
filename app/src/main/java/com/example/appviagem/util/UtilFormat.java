package com.example.appviagem.util;

import androidx.annotation.NonNull;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class UtilFormat {

	public static final String PLURAL = " dias";
	public static final String SINGLE = " dia";
	public static final String LANGUAGE = "pt";
	public static final String COUNTRY = "br";

	public static NumberFormat formatCurrency() {
		return DecimalFormat.getCurrencyInstance(new Locale(LANGUAGE, COUNTRY));
	}

	@NonNull
	public static String formatStringDays(Date dtStart, Date dtEnd) {
		return UtilDate.formatLocale(dtStart) + " - " + UtilDate.formatLocale(dtEnd) + " de " + UtilDate.getYear();
	}

	public static String getTextDays(int day) {
		if (day > 1) {
			return day + PLURAL;
		}
		return day + SINGLE;
	}
}
