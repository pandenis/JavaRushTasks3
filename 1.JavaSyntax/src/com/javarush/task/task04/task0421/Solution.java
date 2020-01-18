package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name1 = reader();
        String name2 = reader();

        String output = comparator(name1, name2);

        if (!output.equals("str")) {
            System.out.println(output);
        }

    }

    static String reader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader.readLine();
    }

    static String comparator(String a, String b) {
        if (a.equals(b)) {
            return "Имена идентичны";
        } else if (a.length() == b.length()) {
            return "Длины имен равны";
        } else

        return "str";
    }
}
