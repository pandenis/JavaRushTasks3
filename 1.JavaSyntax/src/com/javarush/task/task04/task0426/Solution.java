package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        String output;

        if (num !=0) {
             output = isPositive(num) + " " + isEven(num) + " " + "число";
        } else {
            output = "ноль";
        }

        System.out.println(output);
    }

    static String isEven(int a) {
        if (a % 2 == 0) {
            return "четное";
        } else {
            return "нечетное";
        }
    }

    static String isPositive(int a) {
        if (a > 0) {
            return "положительное";
        } else {
            return "отрицательное";
        }
    }
}