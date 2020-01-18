package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Family1", "Name1");
        stringMap.put("Family2", "Name5");
        stringMap.put("Family3", "Name6");
        stringMap.put("Family4", "Name1");
        stringMap.put("Family5", "Name4");
        stringMap.put("Family6", "Name1");
        stringMap.put("Family7", "Name7");
        stringMap.put("Family8", "Name5");
        stringMap.put("Family9", "Name1");
        stringMap.put("Family10", "Name7");

        return stringMap;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int nameCounter = 0;
        for (String entry : map.values()) {
            if (entry.equals(name)) {
                nameCounter++;
            }
        }
        return nameCounter;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int lastNameCounter = 0;
        for (String entry : map.keySet()) {
            if (entry.equals(lastName)) {
                lastNameCounter++;
            }
        }
        return lastNameCounter;

    }

    public static void main(String[] args) {

    }
}
