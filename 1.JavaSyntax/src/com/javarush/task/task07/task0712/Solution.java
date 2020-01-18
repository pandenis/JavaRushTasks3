package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            strings.add(s);
        }

        int shortestString = strings.get(0).length();
        int longestString = strings.get(0).length();

        for (int i = 1; i < strings.size(); i++) {
            int temp = strings.get(i).length();
            if (temp < shortestString) {
                shortestString = temp;
            }
        }

 //       System.out.println("shortestString: " + shortestString);

        int indexOfShortest = 0;

        for (int i = 0; i < strings.size(); i++) {
             if (strings.get(i).length() == shortestString) {
                indexOfShortest = i;
                break;
            }
        }

 //       System.out.println("indexOfShortest: " + indexOfShortest);


        for (int i = 1; i < strings.size(); i++) {
            int temp = strings.get(i).length();
            if (temp > longestString) {
                longestString = temp;
            }
        }

 //       System.out.println("longestString: " + longestString);

        int indexOfLongest = 0;

        for (int i = 0; i < strings.size(); i++) {
             if (strings.get(i).length() == longestString) {
                indexOfLongest = i;
                break;
            }
        }

  //      System.out.println("indexOfLongest: " + indexOfLongest);


        if (indexOfLongest < indexOfShortest) {
            System.out.println(strings.get(indexOfLongest));
        } else {
            System.out.println(strings.get(indexOfShortest));
        }
    }
}
