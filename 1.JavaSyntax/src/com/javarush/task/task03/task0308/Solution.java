package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int sum = 1;

        for (int i = 2; i <= 10; i++)
        {
            sum = sum * i;
        }

        System.out.println(sum);
    }
}
