package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.*;
/*
Модернизация ПО
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        Map<String, String> map = new HashMap<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();

            String city =reader.readLine();
            String family =reader.readLine();
            if (family.isEmpty()) {
                break;
            }
            map.put(city, family);
        }
            String enteredCity =reader.readLine();

        while (iterator.hasNext()) {
            // получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();

            if (pair.getKey().equals(enteredCity)){
                System.out.println(pair.getValue());
                break;
            }
        }

        /*
        List<String> list = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.add(family);
        }

        // Read the house number
        int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
        }
        */
    }
}
