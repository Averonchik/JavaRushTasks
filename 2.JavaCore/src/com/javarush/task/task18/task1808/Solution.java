package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream file1 = new FileInputStream(fileName1);
        FileOutputStream file2 = new FileOutputStream(fileName2);
        FileOutputStream file3 = new FileOutputStream(fileName3);
        reader.close();
        byte[] buffer = new byte[10000];
        int count = 0;
        count = file1.read(buffer);
        file1.close();
        file2.write(buffer, 0, count / 2 + count % 2);
        file3.write(buffer, count / 2 + count % 2, count / 2);
        file2.close();
        file3.close();
    }
}
