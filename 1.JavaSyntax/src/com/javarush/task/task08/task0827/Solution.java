package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("MAY 1 2013"));

    }

    public static boolean isDateOdd(String date) {

        // TODO: 2/6/20 Replace Date to Calendar

        Date dateDate = null;

        String pattern = "MMMM d yyyy";

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        try {
            dateDate = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calDate = new GregorianCalendar();
        calDate.setTime(dateDate);

        int days = calDate.get(Calendar.DAY_OF_YEAR);

        if (days % 2 != 0)
            return true;
        else
            return false;
    }
}
