package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        //System.out.println("Введи размерность листа");
        int N = Integer.parseInt(reader.readLine());
        //System.out.println("Укажи, сколько элементов сдвинуть в конец листа");
        int M = Integer.parseInt(reader.readLine());
        //System.out.println("Заполни лист");
        for (int i = 0; i<N; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i<M; i++) {
            list.add(N, list.get(i));
            N++;
        }

        for (int i = 0; i<M; i++) {
            list.remove(0);
        }

        for (String string : list) {
            System.out.println(string);
        }

    }
}
