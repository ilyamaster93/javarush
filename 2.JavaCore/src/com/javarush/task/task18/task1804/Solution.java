package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //Создаем Дженерик лист для байтов, и МАП лист (байты и кол-во поввторений того или иного байта)
        List <Integer> byteList = new ArrayList<>();
        Map <Integer, Integer> byteMap = new HashMap<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        while (fileInputStream.available()>0) {
            byteList.add(fileInputStream.read());
        }
        fileInputStream.close(); // прочитали, запислаи, закрыли!
        int MIN = Integer.MAX_VALUE; //Создаем переменную для хранения МИНИМАЛЬНОГО значения повторений и присваиваем МАКСИМУМ

        //Проверяем каждый элемент из bytes с самим собой при повторе добавляем в качестве значения value и увел. ее если повтор.
        for (Integer key: byteList) {
            int value = 0;
            for (Integer key2:byteList) {
                if (key.equals(key2)) {
                    value++;
                }
                byteMap.put(key, value);
            }
        }

        //Если значение < чем MIN то MIN принимает значения value
        for (Map.Entry<Integer, Integer> map: byteMap.entrySet()) {
            if (map.getValue()<MIN) {
                MIN = map.getValue();
            }
        }

        //Тут выводим все минимальные(по значению, кол-ву повторов) ключи.
        for (Map.Entry<Integer, Integer> map: byteMap.entrySet()) {
            if (map.getValue()==MIN) {
                System.out.print(map.getKey() + " ");
            }
        }

    }
}
