package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
Перегрузи метод printMatrix() 8 различными способами, чтобы в итоге у тебя получилось 10 различных методов printMatrix().

Требования:
1. В классе Solution должны быть реализованы 10 методов printMatrix() с различными аргументами.
2. Класс Solution должен быть public.
3. Все методы класса Solution должны быть статическими.
4. Все методы класса Solution должны быть публичными.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
        printMatrix(2, (Integer) 3, "8");
        printMatrix((Integer) 2, 3, "8");
        printMatrix((short) 2, 3, "8");
        printMatrix(2, (short) 3, "8");
        printMatrix((byte) 2, 3, "8");
        printMatrix(2, (byte) 3, "8");
        printMatrix((short) 2, (byte) 3, "8");
        printMatrix((byte) 2, (short) 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {//1
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {//10
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    
     public static void printMatrix(int m, Integer n, String value) //2
    {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(Integer m, int n, String value) //3
    {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(short n, int m, String value) //4
    {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int n, short m, String value) //5
    {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(byte n, int m, String value) //6
    {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int n, byte m, String value) //7
    {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(short n, byte m, String value) //8
    {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(byte n, short m, String value) //9
    {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
}
