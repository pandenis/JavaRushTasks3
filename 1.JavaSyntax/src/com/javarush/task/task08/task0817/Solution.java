package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("SurName1", "Name1");
        map.put("SurName2", "Name2");
        map.put("SurName3", "Name3");
        map.put("SurName4", "Name2");
        map.put("SurName10", "Name5");
        map.put("SurName5", "Name6");
        map.put("SurName6", "Name3");
        map.put("SurName7", "Name1");
        map.put("SurName8", "Name9");
        map.put("SurName9", "Name10");

        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> valueList = new ArrayList<>();
        Map<String, String> copy = new HashMap<>(map);

        for (Map.Entry<String, String> entry : copy.entrySet()) {
            int counter = 0;
            String value = entry.getValue();
            for (Map.Entry<String, String> entry1 : copy.entrySet()) {
                if (entry1.getValue().equals(value)) {
                    counter++;
                }
            }
            if (counter > 1) {
                valueList.add(value);
            }
        }

        for (int i = 0; i < valueList.size(); i++) {
            String value = valueList.get(i);
            removeItemFromMapByValue(map, value);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
