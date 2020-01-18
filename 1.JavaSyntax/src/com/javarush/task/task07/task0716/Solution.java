package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> list = strings;
        for (int i = 0; i < list.size();) {
            String string = list.get(i);
            if ((string.contains("р"))&& (!string.contains("л"))) {
                list.remove(i);
            }
            else if (string.contains("л") && (!string.contains("р"))) {
                list.add(i, string);
                i+=2;
            }
            else i++;
        }
        return list;
    }
}