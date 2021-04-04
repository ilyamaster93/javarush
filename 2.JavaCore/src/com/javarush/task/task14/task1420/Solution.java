package com.javarush.task.task14.task1420;


import java.util.Scanner;

/*НОД
        Давай найдем наибольший общий делитель (НОД). Для этого:
        Введи с клавиатуры 2 целых положительных числа.
        Выведи в консоли наибольший общий делитель.

        Требования:
        1. Программа должна считывать с клавиатуры 2 строки.
        2. Если введенные строки невозможно преобразовать в положительные целые числа, должно возникать исключение.
        3. Программа должна выводить данные на экран.
        4. Программа должна выводить на экран наибольший общий делитель (НОД) чисел, считанных с клавиатуры, и успешно завершаться. */

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= 0 || b <= 0) throw new Exception();

        int max = Math.max(a, b);
        for (int i = max; i>0; i--){
            if (a % i == 0  && b % i == 0) {
                System.out.println(i);
                break;
            }
        }


    }
}
