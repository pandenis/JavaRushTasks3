package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        double c = convertEurToUsd(40, 4.1);
        double c1 = convertEurToUsd(60, 3.9);
        System.out.println(c);
        System.out.println(c1);

    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        return (double) eur * course;

    }
}
