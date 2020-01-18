package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        Date date1 = new Date();
        String pattern;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY");
        Date date2 = new Date("JANUARY 1" + simpleDateFormat.format(date1));
        long timeInMilisec = date1.getTime() - date2.getTime();
        long msInDay = 24 * 60 *60 * 1000;

        int days = (int) (timeInMilisec/msInDay);

        if (days % 2 == 0) {
            return false;
        } else
            return true;
    }
}
