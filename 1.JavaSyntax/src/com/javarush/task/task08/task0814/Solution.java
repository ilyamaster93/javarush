package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.*;

/* 
Больше 10? Вы нам не подходите
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<Integer>();
   for (int i=0; i<20; i++) {
            set.add((int)(Math.random()*100));
        }
    return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
            while ( iterator.hasNext())
            {
                Integer number = iterator.next();
                if (number > 10)
                    iterator.remove();
            }
            return (Set)set;
  }
      

    public static void main(String[] args) {
//createSet();
//removeAllNumbersGreaterThan10(Set<Integer> set);
    }
}
