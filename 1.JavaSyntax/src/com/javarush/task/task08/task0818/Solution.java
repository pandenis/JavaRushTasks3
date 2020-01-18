package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("SurName1", 200);
        map.put("SurName2", 300);
        map.put("SurName3", 500);
        map.put("SurName4", 700);
        map.put("SurName5", 400);
        map.put("SurName6", 900);
        map.put("SurName7", 2100);
        map.put("SurName8", 400);
        map.put("SurName9", 500);
        map.put("SurName0", 2300);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Map<String, Integer> copy = new HashMap<>(map);

        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}