package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

            int number;
            int counter = 0;
            int sum = 0;
            float res;
            while (true) {
                number = reader();
                if (number != -1) {
                    sum = sum + number;
                    counter++;
                }
                else {
                    res = (float) sum / (float) counter;
                    System.out.println(res);
                    break;
                }
            }

       }

    static int reader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }
}

