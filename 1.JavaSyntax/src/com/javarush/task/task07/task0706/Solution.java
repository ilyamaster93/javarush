package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."

Примечание:
дом с порядковым номером 0 считать четным.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }
        int evenCount=0;
        for (int i = 1; i < array.length; i=i+2) {
            evenCount = evenCount + array[i];
        }
        int oddCount=0;
        for (int i = 0; i < array.length; i=i+2) {
            oddCount = oddCount + array[i];
        }
        if (evenCount > oddCount) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        else
            System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}