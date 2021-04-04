package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> intList = new ArrayList();
        int [] listOne = {4,5,2,2,4};
        int [] listTwo = {2,2};
        int [] listThree = {5,2,2,4};
        int [] listFour = {1,5,4,5,2,2,4};
        int [] listFIve = new int [0];
        intList.add(listOne);
        intList.add(listTwo);
        intList.add(listThree);
        intList.add(listFour);
        intList.add(listFIve);
        return intList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
