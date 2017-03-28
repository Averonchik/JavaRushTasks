package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);

        ArrayList<Integer> bytes = new ArrayList<>();
        while (fileInputStream.available()>0){
            bytes.add(fileInputStream.read());
        }
        for (int i = bytes.size()-1; i >= 0; i--) {
            fileOutputStream.write(bytes.get(i));
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
