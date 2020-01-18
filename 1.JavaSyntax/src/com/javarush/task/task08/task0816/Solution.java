package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("s2", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне3", dateFormat.parse("JULY 1 2012"));
        map.put("Сталлоне4", dateFormat.parse("JUNE 8 2012"));
        map.put("Сталлоне5", dateFormat.parse("OCTOBER 7 2012"));
        map.put("Сталлоне6", dateFormat.parse("NOVEMBER 6 2012"));
        map.put("Сталлоне7", dateFormat.parse("JUNE 1 2012"));
        map.put("Сталлоне8", dateFormat.parse("SEPTEMBER 15 2012"));
        map.put("Сталлоне9", dateFormat.parse("DECEMBER 13 2012"));
        map.put("Сталлоне0", dateFormat.parse("AUGUST 24 2012"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);

        for (Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
            it.hasNext();)

        {
            Map.Entry<String, Date> dateEntry = it.next();
            String date = dateFormat.format(dateEntry.getValue());
            if (date.contains("Jun") || date.contains("Jul") || date.contains("Aug")) {
                it.remove();
            }
        }

    }

    public static void main(String[] args) {


    }
}
