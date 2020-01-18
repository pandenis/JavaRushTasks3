package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        String output = "str";

        if (num > 0 && num < 1000) {
            output = isEven(num) + " " + numberOfDigits(num) + " число";
        }

        if (!output.equals("str")) {
            System.out.println(output);
        }

    }

    static String isEven(int a) {
        if (a % 2 == 0) {
            return "четное";
        } else {
            return "нечетное";
        }
    }

    static String numberOfDigits(int a) {
        if (a < 10) {
            return "однозначное";
        } else if (a > 9 && a < 100) {
            return "двузначное";
        } else {
            return "трехзначное";
            }
    }
}
