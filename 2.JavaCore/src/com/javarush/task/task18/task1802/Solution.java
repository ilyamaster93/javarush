package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
Ввести с консоли имя файла.
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.


Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться минимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.
*/

public class Solution {
    private static int oneByte;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int smallestByte = 0;
        while (fileInputStream.available()>0) {
            oneByte = fileInputStream.read();
            if (oneByte<smallestByte) {
                smallestByte = oneByte;
            }
        }
        fileInputStream.close();
        reader.close();
        if (smallestByte!=0){
            System.out.println(smallestByte);
        }
        else
            System.out.println(oneByte);
        }
}
