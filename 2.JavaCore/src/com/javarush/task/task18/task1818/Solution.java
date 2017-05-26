package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String f1 = reader.readLine();
            String f2 = reader.readLine();
            String f3 = reader.readLine();
            FileOutputStream file1 = new FileOutputStream(f1);
            FileInputStream file2 = new FileInputStream(f2);
            FileInputStream file3 = new FileInputStream(f3);
            while (file2.available()>0) {
                file1.write(file2.read());
            }
            while (file3.available()>0){
                file1.write(file3.read());
            }
            file1.close();
            file2.close();
            file3.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
