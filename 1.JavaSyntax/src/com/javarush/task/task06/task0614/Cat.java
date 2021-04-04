package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
Создай класс с именем KissMyShinyMetalAss. Создай объект этого класса, выведи его на экран.

Требования:
1. Создай класс KissMyShinyMetalAss внутри класса Solution.
2. Класс KissMyShinyMetalAss должен быть статическим.
3. Класс KissMyShinyMetalAss должен быть public.
4. В методе main создай объект класса KissMyShinyMetalAss.
5. В методе main выведи объект класса KissMyShinyMetalAss на экран.
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats; 
    
    public Cat() {
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
        cats = new ArrayList<Cat>();
        }
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for (int i=0; i < cats.size(); i++)
        {
            System.out.println(cats.get(i));
        }
    }
}
