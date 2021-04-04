package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.


Требования:
1. Программа должна три раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файлы - FileOutputStream
3. Первую половину байт из первого файла нужно записать во второй файл.
4. Вторую половину байт из первого файла нужно записать в третий файл.
5. Потоки FileInputStream и FileOutputStream должны быть закрыты.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName1 = bufferedReader.readLine();
            String fileName2 = bufferedReader.readLine();
            String fileName3 = bufferedReader.readLine();
            bufferedReader.close();

            FileInputStream iStream = new FileInputStream(fileName1);
            FileOutputStream oStream2 = new FileOutputStream(fileName2);
            FileOutputStream oStream3 = new FileOutputStream(fileName3);

            byte[] buffer = new byte[iStream.available()];
            iStream.read(buffer);
            iStream.close();

            if (buffer.length % 2 == 0) {
                oStream2.write(buffer, 0, buffer.length / 2);
                oStream3.write(buffer, buffer.length / 2, buffer.length / 2);
                /*byte[] buffer2 = new byte[buffer.length / 2];
                for (int i = 0; i < buffer.length / 2; i++) {
                    buffer2[i] = buffer[i];*/
//                }

                /*byte[] buffer3 = new byte[buffer.length / 2];
                for (int i = buffer.length / 2; i < buffer.length; i++) {
                    buffer3[i] = buffer[i];
                }

                oStream2.write(buffer2);
                oStream2.write(buffer3);*/
                oStream2.close();
                oStream3.close();
            }
            else {
            oStream2.write(buffer, 0, (buffer.length/2)+1);
            oStream3.write(buffer, (buffer.length/2)+1, buffer.length/2);
               /* byte[] buffer2 = new byte[(buffer.length / 2) + 1];
                for (int i = 0; i < (buffer.length / 2) + 1; i++) {
                    buffer2[i] = buffer[i];
                }

                byte[] buffer3 = new byte[buffer.length / 2];
                for (int i = (buffer.length / 2) + 1; i < buffer.length; i++) {
                    buffer3[i] = buffer[i];
                }

                oStream2.write(buffer2);
                oStream2.write(buffer3);*/

            oStream2.close();
            oStream3.close();
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
