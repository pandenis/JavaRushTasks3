package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a = reader();
        int b = reader();
        int c = reader();

        int output = 0;
        output = counter(a) + counter(b) + counter(c);

        System.out.println(output);
    }

    static int reader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    static int counter(int a) {
        int positiveCount = 0;

        if (a > 0) {
            positiveCount++;
        }
        return positiveCount;
    }

}
