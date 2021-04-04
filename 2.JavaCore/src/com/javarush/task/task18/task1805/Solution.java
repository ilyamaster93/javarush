package com.javarush.task.task18.task1805;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> byteList = new ArrayList<>();
        Set<Integer> byteSet;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        while (fileInputStream.available()>0) {
            byteList.add(fileInputStream.read());
        }
        fileInputStream.close(); // прочитали, запислаи, закрыли!
        Collections.sort(byteList);
        byteSet = new HashSet<>(byteList);
        for (Integer set: byteSet) {
            System.out.print(set + " ");
        }
    }
}
