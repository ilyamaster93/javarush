package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Уиллис", dateFormat.parse("MAY 3 2002"));
        map.put("Шварц", dateFormat.parse("JUNE 1 2011"));
        map.put("Сигал", dateFormat.parse("JUNE 11 2012"));
        map.put("Чан", dateFormat.parse("JULY 1 2011"));
        map.put("Норрис", dateFormat.parse("JUNE 19 2011"));
        map.put("Лунгрен", dateFormat.parse("SEPTEMBER 1 2011"));
        map.put("Лоррис", dateFormat.parse("JUNE 13 2011"));
        map.put("Найтли", dateFormat.parse("JUNE 1 2001"));
        map.put("Портман", dateFormat.parse("JUNE 15 2011"));
        return (Map) map;

    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, Date> pair = iterator.next();

            int month = pair.getValue().getMonth();

            if (month>=5 && month<=7)
            {
                iterator.remove();
            }

        }

    }

    public static void main(String[] args) {

    }
}
