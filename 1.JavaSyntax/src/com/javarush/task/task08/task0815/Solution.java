package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> stringMap = new HashMap<>();

        stringMap.put("Tom", "Smith");
        stringMap.put("Dave", "Cat");
        stringMap.put("Bob", "Smith");
        stringMap.put("Sem", "Cat");
        stringMap.put("Ad", "Jar");
        stringMap.put("Ed", "Moon");
        stringMap.put("Jam", "Moon");
        stringMap.put("Jan", "Son");
        stringMap.put("Nickl", "Black");
        stringMap.put("Hava", "Black");

        return stringMap;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int counter = 0;

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {

            String valueName = iterator.next().getValue();
            if (valueName.equals(name)) {
                counter++;
            }
        }

        return counter;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int counter = 0;

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {

            String valueLastName = iterator.next().getKey();
            if (valueLastName.equals(lastName)) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

    }
}
