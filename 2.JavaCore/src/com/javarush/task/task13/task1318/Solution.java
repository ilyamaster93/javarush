package com.javarush.task.task13.task1318;
import java.io.*;

/*
Чтение файла
В этой задаче тебе нужно:
Считать с консоли имя файла.
Вывести в консоли (на экран) содержимое файла.
Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.

Требования:
1. Программа должна считывать c консоли имя файла.
2. Программа должна выводить на экран содержимое файла.
3. Поток чтения из файла (FileInputStream) должен быть закрыт.
4. BufferedReader также должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();

        InputStream fileInputStream = null;

        try {
            fileInputStream = getInputStream(sourceFileName);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует.");
            sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);
        }

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            char ch = (char) data;
            System.out.print(ch);
        }

        fileInputStream.close();
        reader.close();

    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }
}