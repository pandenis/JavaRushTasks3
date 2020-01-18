package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        String exist = "Треугольник существует.";
        String notExist = "Треугольник не существует.";
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println(exist);
        /*} else if (a + c > b) {
            System.out.println(exist);
        } else if (b + c > a) {
            System.out.println(exist);*/
        } else {
            System.out.println(notExist);
        }

    }
}