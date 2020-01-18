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
        ArrayList<String> strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        for (int i = 0; i < strings.size() - 1; i++) {
            int first = stringLength(strings, i);
            int n = i+1;
            int second = stringLength(strings,n);
            if (first <= second)
            {}
            else {
                System.out.println(n);
                break;
            }

        }
    }

    public static int stringLength(ArrayList<String> strings, int i) {
        return strings.get(i).length();
    }
}