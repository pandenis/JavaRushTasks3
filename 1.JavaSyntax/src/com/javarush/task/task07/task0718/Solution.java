package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        checker(reader());
    }

    public static ArrayList<String> reader() throws IOException {
        ArrayList<String> strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        return strings;
    }

    public static void checker(ArrayList<String> list) {

        for (int i = 0; i < list.size();) {
            String first = list.get(i);
            int secondIndex;
            if (i + 1 != list.size()) {
                secondIndex = i + 1;
            } else
                break;

            String second = list.get(secondIndex);
           // secondIndex = 0;

            int firstSize = first.length();
            int secondSize = second.length();

            if (firstSize > secondSize) {
                System.out.println(secondIndex);
                break;
            } else {
                i++;
            }

        }
    }
}

