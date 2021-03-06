package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

        while (fileReader.ready()) {
            String[] digit = fileReader.readLine().split("[\\s\\n]");
            for (String number : digit) {
                if (number.matches("\\d+"))
                fileWriter.write(number + " ");
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
