package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a = reader();
        int b = reader();
        int c = reader();

        if (a == b && a != c) {
            System.out.println(3);
        } else if (a == c && a != b) {
            System.out.println(2);
        } else if (b == c & a != b) {
            System.out.println(1);
        }

    }

    static int reader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }
}
