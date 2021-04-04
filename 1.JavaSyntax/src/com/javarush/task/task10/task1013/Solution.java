package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.

Требования:
1. Программа не должна считывать данные с клавиатуры.
2. В классе Human должно быть 6 полей.
3. Все поля класса Human должны быть private.
4. В классе Human должно быть 10 конструкторов.
5. Все конструкторы класса Human должны быть public.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private int age;
        private int weight;
        private String name;
        private String momName;
        private String dadName;
        private String sex;

        public Human(int age, int weight) {
            super();
            this.age = age;
            this.weight = weight;
        }

        public Human(int age, String name) {
            super();
            this.age = age;
            this.name = name;
        }

        public Human(int age, int weight, String sex) {
            super();
            this.age = age;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(String name, String sex) {
            super();
            this.name = name;
            this.sex = sex;
        }

        public Human(int age, String name, String momName) {
            super();
            this.age = age;
            this.name = name;
            this.momName = momName;
        }

        public Human(int age, int weight, String name, String momName) {
            super();
            this.age = age;
            this.weight = weight;
            this.name = name;
            this.momName = momName;
        }

        public Human(int age, int weight, String name, String momName, String dadName) {
            super();
            this.age = age;
            this.weight = weight;
            this.name = name;
            this.momName = momName;
            this.dadName = dadName;
        }

        public Human(int age, int weight, String name, String momName, String dadName, String sex) {
            super();
            this.age = age;
            this.weight = weight;
            this.name = name;
            this.momName = momName;
            this.dadName = dadName;
            this.sex = sex;
        }

        public Human(String name, String momName, String dadName, String sex) {
            super();
            this.name = name;
            this.momName = momName;
            this.dadName = dadName;
            this.sex = sex;
        }

        public Human(String name) {
            super();
            this.name = name;
        }

    }
}
