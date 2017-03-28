package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        FileOutputStream fileOutputStream2 = new FileOutputStream(file3);

        byte[] buff = new byte[inputStream.available() / 2 + inputStream.available() % 2];
        byte[] buff2 = new byte[inputStream.available() / 2];

        fileOutputStream.write(buff, 0, inputStream.read(buff));
        fileOutputStream2.write(buff2, 0 , inputStream.read(buff2));

        inputStream.close();
        fileOutputStream.close();
        fileOutputStream2.close();
    }
}
