package com.javarush.task.task08.task0811;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Квартет «Методы»
Реализовать 4 метода.
Каждый из них должен возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций).
Ничего измерять не нужно.
*/

public class Solution {
    public static List getListForGet() {
        //напишите тут ваш код
        ArrayList<Object> listA1 = new ArrayList<Object>();
        return listA1;

    }

    public static List getListForSet() {
        //напишите тут ваш код
        ArrayList<List> listA2 = new ArrayList<List>();
        return listA2;

    }

    public static List getListForAddOrInsert() {
        //напишите тут ваш код
        LinkedList<List> listL1 = new LinkedList<List>();
        return listL1;
    }

    public static List getListForRemove() {
        //напишите тут ваш код
        LinkedList<String> listL2 = new LinkedList<String>();
        return listL2;
    }

    public static void main(String[] args) {

    }
}
