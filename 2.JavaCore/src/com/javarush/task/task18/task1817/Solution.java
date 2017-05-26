package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        double spaces = 0;
        double chars = 0;
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
            while (fileReader.ready()) {
                int charFile = fileReader.read();
                if (charFile==32)
                    spaces++;
                chars++;
            }
            fileReader.close();
            double charss = spaces/chars*100;
            System.out.println(String.format("%(.2f", charss));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
