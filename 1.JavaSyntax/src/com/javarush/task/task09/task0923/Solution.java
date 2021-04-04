package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Гласные и согласные
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
Пример ввода:
Мама мыла раму.

Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = reader.readLine();
        List<Character> vovelss = new ArrayList<>();
        List<Character> other = new ArrayList<>();
        char[] sentenceChar = null;
        sentenceChar = sentence.trim().toCharArray();
        for (int i=0; i<sentenceChar.length; i++){
            
            if (isVowel(sentenceChar[i])) {
                vovelss.add(sentenceChar[i]);
            }
            else if (sentenceChar [i] == ' ')// проверяем есть ли пробел, и пропускаем его
            {
                continue;
            }
            else
            {
                other.add(sentenceChar[i]); //остальные буквы или другие символы(точка например), помещаем в свой список
            }
        }
        for (char c : vovelss)//бежим по списку, в который положили гласные
        {
            System.out.print(c + " "); //выводи гланые на экран, не забываем пробел между ними
        }

        System.out.println(); // переводим курсов на другую строчку

        for (char c : other) //бежим по списку согласных
        {
            System.out.print(c + " "); //выводим на экран все остальные символы, через пробел
        }
        
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}