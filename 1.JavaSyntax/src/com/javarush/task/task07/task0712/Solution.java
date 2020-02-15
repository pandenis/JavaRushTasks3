package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        int shortestSize = strings.get(0).length();
        int longestSize  = strings.get(0).length();

        int indexOfShortest = 0;
        int indexOfLongest = 0;

        for (int i = 0; i < strings.size(); i++) {
            int currentElementSize = strings.get(i).length();
            if (shortestSize > currentElementSize) {
                shortestSize = currentElementSize;
                indexOfShortest = i;
            }

            if (longestSize < currentElementSize) {
                longestSize = currentElementSize;
                indexOfLongest = i;
            }
        }

        String string;

        if (indexOfLongest < indexOfShortest) {
            string = strings.get(indexOfLongest);
        } else {
            string = strings.get(indexOfShortest);
        }

        System.out.println(string);


    }
}
