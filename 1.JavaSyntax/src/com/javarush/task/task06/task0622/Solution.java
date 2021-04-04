package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

Пример ввода:
3
2
15
6
17

Пример вывода:
2
3
6
15
17
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());
        int fourNumber = Integer.parseInt(reader.readLine());
        int fiveNumber = Integer.parseInt(reader.readLine());
        int[] array = new int[5];
        array[0] = firstNumber;
        array[1] = secondNumber;
        array[2] = thirdNumber;
        array[3] = fourNumber;
        array[4] = fiveNumber;

        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[i] < array[--j]) {
                if (j == 0 || array[i] >= array[j - 1]) {
                    int x = array[i];
                    for (int k = i; k > j; k--)
                        array[k] = array[k - 1];
                    array[j] = x;
                }
            }
        }
        for (int x : array)
            System.out.println(x + " ");
    }
}
