package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String nums = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String f1 = reader.readLine();
            String f2 = reader.readLine();
            reader.close();
            BufferedReader file1 = new BufferedReader(new FileReader(f1));
            BufferedWriter file2 = new BufferedWriter(new FileWriter(f2));
            while (file1.ready()){
                String[] numbersString = file1.readLine().split(" ");
                for (int i = 0; i < numbersString.length; i++) {
                    nums += (Math.round(Double.parseDouble(numbersString[i]))) + " ";
                }
            }
            file1.close();
            file2.write(nums);
            file2.flush();
            file2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
