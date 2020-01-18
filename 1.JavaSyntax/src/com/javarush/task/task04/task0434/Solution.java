package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int d = 10;
        int n = 1;
        int p = 1;
        while (d <= 100) {
            String str = n + "";
            while (n < d) {
                n = n+p;
                str = str + " " + n;
            }
            System.out.println(str);
            d = d + 10;
            n = d / 10;
            p = n;
        }


    }
}
