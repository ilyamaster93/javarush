package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.*;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> map = new HashMap<>();
        map.put("Петров", "Дима");
        map.put("Иванов", "Женя");
        map.put("Михайлов", "Алекс");
        map.put("Трасько", "Оля");
        map.put("Милошевич", "Олеся");
        map.put("Радионович", "Марго");
        map.put("Поркурат", "Анастэйша");
        map.put("Черницкович", "Макс");
        map.put("Обломов", "Дима");
        map.put("Грэй", "Декстер");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> name = new HashMap<String, String>(map);
        for(Map.Entry pair : name.entrySet()){
            int count = 0;
            String a = (String) pair.getValue();
            for (Map.Entry pair2 : name.entrySet()) {
                if (pair2.getValue().equals(a))
                    count++;
            }
            if(count > 1){
                for(int i = 0; i < count; i++)
                    removeItemFromMapByValue(map, String.valueOf(a));
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
