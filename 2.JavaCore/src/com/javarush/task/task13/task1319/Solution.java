package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
В этой задаче тебе нужно:
Прочесть с консоли имя файла.
Считывать строки с консоли, пока пользователь не введет строку "exit".
Вывести абсолютно все введенные строки в файл, каждую строчку — с новой строки.
*/

import java.io.*;

public class Solution {

	public static void main(String[] args) {
		String outputFileName = "file.txt";

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

			String nameFile = reader.readLine();
			String fullFileName = "c:\\" + nameFile + ".txt"; // немного облегчил себе поиск созданного файла
			//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fullFileName, true));

			try (BufferedWriter writter = new BufferedWriter(new FileWriter(fullFileName))) {

				while (true){
					String temp = reader.readLine();
					if(temp.equals("exit")){
						writter.write(temp);         //пишем сточку exit в файл
						break;                                         //и на выход!
					}
					else {
						writter.write(temp);     //пишем сточку в файл
						writter.newLine();       //каждая строчка с новой строки
					}
				}


			}

		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
