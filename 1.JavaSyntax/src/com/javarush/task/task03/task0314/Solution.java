package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        int sum = 0;
        int r = 1;
        int i = 0;
        int max = 10;
        while( max <= 100) {
            while (i < max) {
                sum = sum + r;
                System.out.print(sum + " ");
                i++;
            }

            r++;
            sum = 0;
            max = max + 10;
            System.out.println();
        }
    }
}
