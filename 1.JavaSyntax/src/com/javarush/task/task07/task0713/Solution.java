package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> dividedByTree = new ArrayList<>();
        ArrayList<Integer> dividedByTwo = new ArrayList<>();
        ArrayList<Integer> others = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            mainList.add(Integer.parseInt(reader.readLine()));
        }

        for (Integer integer : mainList) {
            if (integer%3 == 0) {
                dividedByTree.add(integer);
            }

            if (integer%2 == 0) {
                dividedByTwo.add(integer);
            }

            if (!(integer%3 == 0) && !(integer%2 ==0)) {
                others.add(integer);
            }
        }

        printList(dividedByTree);
        printList(dividedByTwo);
        printList(others);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
