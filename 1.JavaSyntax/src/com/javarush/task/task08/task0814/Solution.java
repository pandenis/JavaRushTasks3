package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            Integer number = i * 2;
            set.add(number);
        }

        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number > 10) {
                iterator.remove();
            }
        }

        return set;
    }

    public static void main(String[] args) {

    }
}
