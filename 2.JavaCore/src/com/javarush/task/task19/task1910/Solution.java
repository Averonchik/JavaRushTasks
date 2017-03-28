package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

        String[] texts = fileReader.readLine().split("\\p{Punct}");
        for (int i = 0; i < texts.length; i++) {
            fileWriter.write(texts[i]);
        }
        fileReader.close();
        fileWriter.close();
    }
}
