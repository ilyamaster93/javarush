package com.javarush.task.task06.task0617;

/* 
Блокнот для новых идей
Создай класс с именем KissMyShinyMetalAss. Создай объект этого класса, выведи его на экран.

Требования:
1. Создай класс KissMyShinyMetalAss внутри класса Solution.
2. Класс KissMyShinyMetalAss должен быть статическим.
3. Класс KissMyShinyMetalAss должен быть public.
4. В методе main создай объект класса KissMyShinyMetalAss.
5. В методе main выведи объект класса KissMyShinyMetalAss на экран.
*/

public class Solution {

    public static class Idea {
        public String getDescription() {
            return "Мазафака";
        }
    }
    public static void main(String[] args) {
        printIdea(new Idea());
    }
    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }

    //напишите тут ваш код

}

