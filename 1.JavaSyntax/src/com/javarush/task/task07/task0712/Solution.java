package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int minLenght=Integer.MAX_VALUE;
        int maxLenght=Integer.MIN_VALUE;
        int minLenghtIndex=0;
        int maxLenghtIndex=0;

        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() < minLenght) {
                minLenght = list.get(i).length();
                minLenghtIndex=i;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() > maxLenght) {
                maxLenght = list.get(i).length();
                maxLenghtIndex=i;
            }
        }

        if (minLenghtIndex<maxLenghtIndex) {
            System.out.println(list.get(minLenghtIndex));
        }
        else {
            System.out.println(list.get(maxLenghtIndex));
        }
    }
}
