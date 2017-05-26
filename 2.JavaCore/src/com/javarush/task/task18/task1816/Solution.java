package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        char[] engWord = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int countWord = 0;
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
            while (fileReader.ready()){
                char[] stringFile = fileReader.readLine().toUpperCase().toCharArray();
                for (int i = 0; i < stringFile.length; i++) {
                    for (int j = 0; j < engWord.length; j++) {
                        if (stringFile[i] == engWord[j])
                            countWord++;
                    }
                }
            }
            fileReader.close();
            System.out.println(countWord);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
