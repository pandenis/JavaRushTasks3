package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
        Map<String, Cat> catMap = new HashMap<>();

        Cat cat1 = new Cat("Cat1");
        Cat cat2 = new Cat("Cat2");
        Cat cat3 = new Cat("Cat3");
        Cat cat4 = new Cat("Cat4");
        Cat cat5 = new Cat("Cat5");
        Cat cat6 = new Cat("Cat6");
        Cat cat7 = new Cat("Cat7");
        Cat cat8 = new Cat("Cat8");
        Cat cat9 = new Cat("Cat9");
        Cat cat10 = new Cat("Cat10");

        catMap.put("Cat1", cat1);
        catMap.put("Cat2", cat2);
        catMap.put("Cat3", cat3);
        catMap.put("Cat4", cat4);
        catMap.put("Cat5", cat5);
        catMap.put("Cat6", cat6);
        catMap.put("Cat7", cat7);
        catMap.put("Cat8", cat8);
        catMap.put("Cat9", cat9);
        catMap.put("Cat10", cat10);

        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> cats = new HashSet<Cat>(map.values());
        return cats;
        
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
