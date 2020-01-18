package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a = reader();
        int b = reader();
        int c = reader();
        int temp;

        if (b > a) {
            temp = a;
            a = b;
            b = temp;
        }

        if (c > b) {
            temp = b;
            b = c;
            c = temp;
        }

        if (b > a) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println(a + " " + b  + " " + c);

    }

    public static int reader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

}
