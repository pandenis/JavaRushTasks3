package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> list = new HashMap<>();
        list.put("Family1", 10000);
        list.put("Family2", 1000);
        list.put("Family3", 5000);
        list.put("Family4", 1004);
        list.put("Family5", 499);
        list.put("Family6", 1056);
        list.put("Family7", 800);
        list.put("Family8", 1056);
        list.put("Family9", 100);
        list.put("Family10", 1003);

        return list;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Integer integer = iterator.next().getValue();
            if (integer < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}