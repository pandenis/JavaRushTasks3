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
        List<Integer> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }

        List<Integer> sortedArrayList = new ArrayList<>();
        int countOfLength = 1;
        for (int i = 0; i < arrayList.size() - 1; i++) {

            Integer first = arrayList.get(i);
            int n = i + 1;
            Integer second = arrayList.get(n);
            if (first.equals(second)) {
                countOfLength++;
            } else if (!first.equals(second)){
                    sortedArrayList.add(countOfLength);
                    countOfLength = 1;
                                }
            sortedArrayList.add(countOfLength);
        }
        int max = sortedArrayList.get(0);

        for (int i = 0; i < sortedArrayList.size(); i++) {
            if (sortedArrayList.get(i) > max)
                max = sortedArrayList.get(i);
        }

        System.out.println(max);



    }
}