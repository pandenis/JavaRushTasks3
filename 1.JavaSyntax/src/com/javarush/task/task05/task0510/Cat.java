package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 3;
        this.weight = 4;
        this.address = null;
        this.color = "black";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = null;
        this.color = "black";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 4;
        this.address = null;
        this.color = "black";
    }

    public void initialize(int weight, String color){
        this.name = null;
        this.age = 3;
        this.weight = weight;
        this.address = null;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        this.name = null;
        this.age = 3;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }



    public static void main(String[] args) {

    }
}
