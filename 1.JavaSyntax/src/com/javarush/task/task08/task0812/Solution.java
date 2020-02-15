package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integers.add(reader());
        }

        System.out.println(chain(integers));

    }

    public static Integer reader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    public static int chain(List<Integer> arrayList) {
        int firstChainLength = 1;
        int longestChainLength = 1;
        int secondElement = 1;
        int firstElement = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            if (i < arrayList.size() - 1) {
                firstElement = arrayList.get(i);
            }
            int j = i + 1;
            if (j == arrayList.size()) {
                break;
            }
            secondElement = arrayList.get(j);




            if (firstElement == secondElement) {
                firstChainLength++;
                if (firstChainLength > longestChainLength) {
                    longestChainLength = firstChainLength;
                }
            } else firstChainLength = 1;
        }

        return longestChainLength;
    }
}