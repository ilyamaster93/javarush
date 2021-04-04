package com.javarush.task.task08.task0801;

/* 
Set из растений
Создать коллекцию Set (реализация HashSet) с типом элементов String.
Добавить в неё следующие строки:
арбуз
банан
вишня
груша
дыня
ежевика
женьшень
земляника
ирис
картофель

Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
//<String> set = new HashSet<>(Arrays.asList("арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "женьшень", "земляника", "ирис", "картофель")); - не проходит валидацию()

Set<String> set = new HashSet<String>();
    set.add("арбуз");
    set.add("банан");
    set.add("вишня");
    set.add("груша");
    set.add("дыня");
    set.add("ежевика");
    set.add("женьшень");
    set.add("земляника");
    set.add("ирис");
    set.add("картофель");
   /* 
    for (String sets: set){
    System.out.println(sets);
    }
    */
    set.forEach((v) -> System.out.println(v));
}
}
