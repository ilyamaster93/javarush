package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution {
    static int m;
    static int n;
    static int k;

    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        ArrayList<Integer> first = new ArrayList<Integer>();
        ArrayList<Integer> dividerThree = new ArrayList<Integer>();
        ArrayList<Integer> dividerTwo = new ArrayList<Integer>();
        ArrayList<Integer> dividerOther = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            first.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < first.size(); i++) {

            if (first.get(i) % 3 == 0 && first.get(i) % 2 == 0) {
                dividerThree.add(m, first.get(i));
                m++;
                dividerTwo.add(n, first.get(i));
                n++;
            } else if (first.get(i) % 3 == 0) {
                dividerThree.add(m, first.get(i));
                m++;
            } else if (first.get(i) % 2 == 0) {
                dividerTwo.add(n, first.get(i));
                n++;
            } else {
                dividerOther.add(k, first.get(i));
                k++;
            }
        }
        printList(dividerThree);
        printList(dividerTwo);
        printList(dividerOther);
    }

    public static void printList(ArrayList<Integer> list) {
        // напишите тут ваш код
        for (Integer string : list) {
            System.out.println(string);
        }
    }
}
