package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        String string = "количество дней в году: ";
        int v = 366;
        int r = 365;

        if (num % 400 == 0) {
            System.out.println(string + v);
        } else if (num % 100 == 0) {
            System.out.println(string + r);
        } else if (num % 4 == 0) {
            System.out.println(string + v);
        } else {
            System.out.println(string + r);
        }
    }
}