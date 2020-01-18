package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double minute = Double.parseDouble(reader.readLine());

        String green = "зелёный";
        String yellow = "жёлтый";
        String red = "красный";

        if (minute < 3) {
            System.out.println(green);
        } else if (minute >= 3 && minute < 4) {
            System.out.println(yellow);
        } else if (minute >= 4 && minute < 5) {
            System.out.println(red);
        } else if (minute >= 5) {

            minute = minute % 5.0;

            if (minute < 3) {
                System.out.println(green);
            } else if (minute >= 3 && minute < 4) {
                System.out.println(yellow);
            } else if (minute >= 4 && minute < 5) {
                System.out.println(red);
            }

        }
    }
}