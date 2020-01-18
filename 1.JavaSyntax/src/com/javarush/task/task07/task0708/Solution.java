package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        int maxStringLength = strings.get(0).length();

        for (int i = 1; i < 5; i++) {
            int stringLength = strings.get(i).length();
            if (stringLength > maxStringLength)
                maxStringLength = stringLength;
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == maxStringLength)
                System.out.println(strings.get(i));
        }
    }
}
