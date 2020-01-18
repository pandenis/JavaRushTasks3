package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 9; i++) {
            System.out.println(8);
            for (int l = 0; l <= i; l++) {
                System.out.print(8);
            }
        }
        System.out.println(8);

    }
}
