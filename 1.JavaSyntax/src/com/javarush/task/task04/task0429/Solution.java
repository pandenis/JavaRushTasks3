package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a = reader();
        int b = reader();
        int c = reader();

        counter(a);;
        counter(b);
        counter(c);

        System.out.println("количество отрицательных чисел: " + negatives);
        System.out.println("количество положительных чисел: " + positives);

    }

    static public int positives = 0;
    static public int negatives = 0;

    static int reader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    static void counter(int a){
        if (a > 0) {
            positives++;
        } else if (a < 0) {
            negatives++;
        }
    }
}
