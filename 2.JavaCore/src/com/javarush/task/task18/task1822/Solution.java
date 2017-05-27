package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String f1 = reader.readLine();
            reader.close();
            BufferedReader file = new BufferedReader(new FileReader(f1));
            while (file.ready()){
                String lineFile = file.readLine();
                String[] lineFileArray = lineFile.split(" ");
                if (lineFileArray[0].equals(args[0])) {
                    System.out.println(lineFile);
                    file.close();
                }
            }
            file.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
