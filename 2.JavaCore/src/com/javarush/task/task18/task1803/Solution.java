package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Самые частые байты
Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //Создаем Дженерик лист для байтов, и МАП лист (байты и кол-во поввторений того или иного байта)
        List<Integer> byteList = new ArrayList<>();
        Map<Integer, Integer> byteMap = new HashMap<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        while (fileInputStream.available()>0) {
            byteList.add(fileInputStream.read());
        }
        fileInputStream.close(); // прочитали, запислаи, закрыли!
        int MAX = Integer.MIN_VALUE; //Создаем переменную для хранения МАКСИМАЛЬНОГО значения повторений и присваиваем МИНИМУМ

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

        //Если значение > чем MAX то MAX принимает значения value
        for (Map.Entry<Integer, Integer> map: byteMap.entrySet()) {
            if (map.getValue()>MAX) {
                MAX = map.getValue();
            }
        }

        //Тут выводим все минимальные(по значению, кол-ву повторов) ключи.
        for (Map.Entry<Integer, Integer> map: byteMap.entrySet()) {
            if (map.getValue()==MAX) {
                System.out.print(map.getKey() + " ");
            }
        }

        /*
        АЛЬТЕРНАТИВНОЕ РЕШЕНИЕ
        1. Создал HashMap и ArrayList
2. Заполнил ArrayList данными из файла через while (is.available() > 0)
3. Через цикл for заполнил HashMap ключами из ArrayList и значениями через Collections.frequency
4. Нашел максимальные значения в HashMap через Collections.max(map.values()
5. Через цикл for прошелся по HashMap. проверил значения на равенство максимальному числу (из п.4 выше) и вывел на экран их ключи + " ".
        */


    }
}
