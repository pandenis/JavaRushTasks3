package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name = reader();
        int age = Integer.parseInt(reader());
        String string = "И 18-ти достаточно";

        if (age > 20) {
            System.out.println(string);
        }

    }

    static String reader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
