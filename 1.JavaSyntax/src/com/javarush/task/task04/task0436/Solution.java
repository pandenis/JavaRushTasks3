package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int m = reader();
        int n = reader();

        for (int i = 0; i < m; i++) {
            for (int l = 1; l < n; l++) {
                System.out.print(8);
        }
            System.out.println(8);
        }

    }

    static int reader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }
}
