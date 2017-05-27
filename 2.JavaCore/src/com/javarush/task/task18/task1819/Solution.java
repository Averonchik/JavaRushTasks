package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String f1 = reader.readLine();
            String f2 = reader.readLine();
            reader.close();
            FileInputStream fileInputStream = new FileInputStream(f1);
            ArrayList<Byte> file1 = new ArrayList<>();
            while (fileInputStream.available()>0) {
                file1.add((byte) fileInputStream.read());
            }
            fileInputStream.close();
            FileOutputStream fileOutputStream = new FileOutputStream(f1);
            FileInputStream fileInputStream1 = new FileInputStream(f2);
            while (fileInputStream1.available()>0) {
                fileOutputStream.write(fileInputStream1.read());
            }
            fileInputStream1.close();
            for (int i = 0; i < file1.size(); i++) {
                fileOutputStream.write(file1.get(i));
            }
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
