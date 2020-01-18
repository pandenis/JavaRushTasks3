package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(0, "0");
        arrayList.add(1, "1");
        arrayList.add(2, "2");
        arrayList.add(3, "3");
        arrayList.add(4, "4");

        System.out.println(arrayList.size());

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
