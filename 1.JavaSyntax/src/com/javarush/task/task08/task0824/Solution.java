package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код


        Human son1 = new Human("SonName1", true, 10);
        Human son2 = new Human("SonName2", true, 12);
        Human daughter = new Human("DaughterName", false, 7);
        Human.children.add(son1);
        Human.children.add(son2);
        Human.children.add(daughter);

        Human father = new Human("FatherName", true, 45, Human.children);
        Human maher = new Human("MatherName", false, 42, Human.children);

        Human.children.clear();
        Human.children.add(father);


        Human grandFather1 = new Human("GFatherName1", true, 78, Human.children);
        Human grandMather2 = new Human("GFatherName2", false, 77, Human.children);

        Human.children.clear();
        Human.children.add(maher);
        Human grandMather1 = new Human("GFatherName1", false, 76, Human.children);
        Human grandFather2 = new Human("GFatherName2", true, 80, Human.children);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        static ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
