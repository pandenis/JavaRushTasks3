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
        Set<Integer> integerSet = new HashSet<>(20);
        for (int i = 0; i < 20; i++) {
            integerSet.add(i);
        }
        return integerSet;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> integer = set.iterator();

        while (integer.hasNext()) {
            if (integer.next() > 10) {
                integer.remove();
            }
        }

        return set;

    }

    public static void main(String[] args) {
        removeAllNumbersGreaterThan10(createSet());
    }
}
