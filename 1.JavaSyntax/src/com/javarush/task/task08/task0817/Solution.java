package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("фамилия1", "имя1");
        stringMap.put("фамилия2", "имя2");
        stringMap.put("фамилия3", "имя5");
        stringMap.put("фамилия4", "имя2");
        stringMap.put("фамилия5", "имя1");
        stringMap.put("фамилия6", "имя5");
        stringMap.put("фамилия7", "имя4");
        stringMap.put("фамилия8", "имя6");
        stringMap.put("фамилия9", "имя7");
        stringMap.put("фамилия10", "имя10");

        return stringMap;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> lst = new ArrayList<String>(map.values());

        int count;
        for (String str : lst) {
            count = 0;
            for (String str2 : lst) {
                if (str.equals(str2))
                    count++;
                if (count==2) removeItemFromMapByValue (map, str);
            }
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
