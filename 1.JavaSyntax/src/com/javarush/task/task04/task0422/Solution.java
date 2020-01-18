package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name = reader();
        int age = Integer.parseInt(reader());
        String string = "Подрасти еще";

        if (age < 18) {
            System.out.println(string);
        }
    }

    static String reader () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }


}
