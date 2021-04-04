package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.*;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("Петров", 300);
    map.put("Иванов", 300);
    map.put("Михайлов", 1000);
    map.put("Трасько", 700);
    map.put("Милошевич", 700);
    map.put("Радионович", 600);
    map.put("Поркурат", 600);
    map.put("Черницкович", 600);
    map.put("Вася", 300);
    map.put("Дима", 300);
      return map;
            }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
         Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

   while (iterator.hasNext())
    {
        //получение «пары» элементов
        Map.Entry<String, Integer> pair = iterator.next();
            //map.entrySet().removeIf(e -> e.getValue() < 500);
            
            if (pair.getValue() < 500)
                iterator.remove(); 
                
    }
    
    }

    public static void main(String[] args) {

    }
}