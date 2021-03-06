package com.vardanian.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestUtils {

    public static Calendar birthDay = GregorianCalendar.getInstance();

    public static final Date convertDate(Calendar date) {
        return new Date(date.getTimeInMillis());
    }

    public static void setUserBirthday(int year, int month, int day) {
        birthDay.set(Calendar.YEAR, year);
        birthDay.set(Calendar.MONTH, month);
        birthDay.set(Calendar.DAY_OF_MONTH, day);
    }
}
