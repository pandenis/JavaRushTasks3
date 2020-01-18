package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> catHashMap = new HashMap<>();
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            names.add("Name" + i);
        }

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            catHashMap.put(name, new Cat(name));
        }

        return catHashMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код

        Set<Cat> catSet = new HashSet<>(10);
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry)iterator.next();
            catSet.add((Cat) pair.getValue());
        }

        return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
